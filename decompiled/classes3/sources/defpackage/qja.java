package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qja implements defpackage.qil {
    public final defpackage.qid a;
    public final defpackage.qid b;
    public final boolean c;
    private final defpackage.qim d;

    public qja(defpackage.qid qidVar, defpackage.qid qidVar2, boolean z, defpackage.qim qimVar) {
        aooh.f(qidVar, "answerActionKey");
        aooh.f(qidVar2, "hangUpActionKey");
        aooh.f(qimVar, com.android.onboarding.config.workerforegroundpriority.WorkerForegroundPriority.KEY_PRIORITY);
        this.a = qidVar;
        this.b = qidVar2;
        this.c = z;
        this.d = qimVar;
    }

    @Override // defpackage.qil
    public final defpackage.qim a() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qja) {
            defpackage.qja qjaVar = (defpackage.qja) obj;
            if (this.a == qjaVar.a && this.b == qjaVar.b && this.c == qjaVar.c && this.d == qjaVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + anty.L(this.c)) * 31) + this.d.hashCode();
    }

    public final java.lang.String toString() {
        return "ScreeningCallStyleNotificationParams(answerActionKey=" + this.a + ", hangUpActionKey=" + this.b + ", shouldApplyCallStyle=" + this.c + ", priority=" + this.d + ')';
    }
}
