package dag_15.singleton;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.Instant;

public final class Logger {
	private static final Logger INSTANCE = new Logger();

	private Logger() {}

	public static Logger getInstance() {
		return INSTANCE;
	}

	public void log(String message) {
		System.out.println(message);
	}

	public void log(String message, Path logPath) throws IOException {
		try (
			BufferedWriter bw = Files.newBufferedWriter(
				logPath,
				StandardCharsets.UTF_8,
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND
			)
		) {
			bw.write(Instant.now() + ": " + message);
			bw.newLine();
		}
	}
}
