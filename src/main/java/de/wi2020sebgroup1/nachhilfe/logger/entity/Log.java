package de.wi2020sebgroup1.nachhilfe.logger.entity;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Log")
public class Log implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String message;
	private String source;
	private String date;
	private String time;
	
	public Log(String id, String message, String source, String date, String time) {
		super();
		this.id = id;
		this.message = message;
		this.source = source;
		this.date = date;
		this.time = time;
	}
	
	public Log(String message, String source, String date, String time) {
		super();
		this.message = message;
		this.source = source;
		this.date = date;
		this.time = time;
	}
	
	public Log() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Log [id=" + id + ", message=" + message + ", source=" + source + ", date=" + date + ", time=" + time
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, id, message, source, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Log other = (Log) obj;
		return Objects.equals(date, other.date) && Objects.equals(id, other.id)
				&& Objects.equals(message, other.message) && Objects.equals(source, other.source)
				&& Objects.equals(time, other.time);
	}
	
}
