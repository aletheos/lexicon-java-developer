package dag_15.singleton;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	private static final Scanner SCANNER = new Scanner(System.in);
	private static final Pattern ILLEGAL_CHARS = Pattern.compile("[\\\\/:*?\"<>|]");

	public static void main(String[] args) {
		try {
			String fileName = getFileName(args);
			Path logPath = getPath(fileName);

			Logger.getInstance().log("Hellow 'earled :3");
			Logger.getInstance().log("ÚwÙ wut dis?!", logPath);
			Logger.getInstance().log(SCANNER.nextLine(), logPath);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	private static String getFileName(String[] args) {
		String fileName;
		if (args.length > 0) {
			fileName = validateName(args[0]);
		} else {
			fileName = "Logger_output";
		}
		return fileName;
	}

	private static String validateName(String fileName) {
		if (ILLEGAL_CHARS.matcher(fileName).find()) {
			throw new IllegalArgumentException("Invalid file name: " + fileName);
		}
		return fileName;
	}

	private static Path getPath(String fileName) throws URISyntaxException, IOException {
		Path logPath = getLogPath(fileName);
		Files.createDirectories(logPath.getParent());
		return logPath;
	}

	private static Path getLogPath(String fileName) throws URISyntaxException {
		Path rootPath = Paths.get(Objects.requireNonNull(Main.class.getResource("")).toURI()
		);
		rootPath = rootPath.resolve("logs").toAbsolutePath().normalize();
		Path logPath = rootPath.resolve(fileName + ".log");
		if (!logPath.startsWith(rootPath)) {
			throw new IllegalArgumentException("Invalid path: " + logPath);
		}
		return logPath;
	}
}
