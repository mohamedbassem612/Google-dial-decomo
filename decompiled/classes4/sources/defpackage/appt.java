package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class appt {
    public final apoy a = new apoy();
    public boolean b;
    public boolean c;
    public final java.util.concurrent.locks.ReentrantLock d;
    public final java.util.concurrent.locks.Condition e;
    public final apqb f;
    public final apqd g;

    public appt() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = new java.util.concurrent.locks.ReentrantLock();
        this.d = reentrantLock;
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        aooh.e(conditionNewCondition, "newCondition(...)");
        this.e = conditionNewCondition;
        this.f = new defpackage.appr(this);
        this.g = new defpackage.apps(this);
    }
}
