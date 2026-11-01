package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alqe {
    public final java.lang.Runnable a;
    public final java.util.concurrent.ScheduledFuture b;

    public alqe(java.lang.Runnable runnable, java.util.concurrent.ScheduledFuture scheduledFuture) {
        this.a = runnable;
        this.b = scheduledFuture;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alqe) {
            defpackage.alqe alqeVar = (defpackage.alqe) obj;
            if (this.a.equals(alqeVar.a) && this.b.equals(alqeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        java.util.concurrent.ScheduledFuture scheduledFuture = this.b;
        return "RunnableScheduledFuturePair{runnable=" + this.a.toString() + ", future=" + scheduledFuture.toString() + '}';
    }

    public alqe() {
        throw null;
    }
}
