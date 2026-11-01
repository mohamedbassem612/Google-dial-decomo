package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aio {
    public final int a;
    private final air b;

    public aio(air airVar, int i) {
        this.b = airVar;
        this.a = i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimationResult(endReason=");
        sb.append((java.lang.Object) (this.a != 1 ? "Finished" : "BoundReached"));
        sb.append(", endState=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
