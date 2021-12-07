package hello.advanced.trace;

public class TraceStatus {

    private TraceId traceId; // 내부에 트랜잭션 Id를 가지고 있다.
    private Long startTimeMs; // 로그의 시작 시간. (종료 시간 계산 = 시작 ~ 종료)
    private String message; // 시작시 사용한 메시지

    public TraceStatus(TraceId traceId, Long startTimeMs, String message) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.message = message;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMessage() {
        return message;
    }
}
