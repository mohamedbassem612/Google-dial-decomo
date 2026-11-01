package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qip implements defpackage.qil {
    public final defpackage.qid a;
    public final defpackage.qid b;
    private final defpackage.qim c;
    private final boolean d = false;

    public qip(defpackage.qid qidVar, defpackage.qid qidVar2, defpackage.qim qimVar) {
        this.a = qidVar;
        this.b = qidVar2;
        this.c = qimVar;
    }

    @Override // defpackage.qil
    public final defpackage.qim a() {
        return this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qip) {
            defpackage.qip qipVar = (defpackage.qip) obj;
            if (this.a == qipVar.a && this.b == qipVar.b && this.c == qipVar.c) {
                boolean z = qipVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "IncomingCallStyleNotificationParams(declineActionKey=" + this.a + ", answerActionKey=" + this.b + ", priority=" + this.c + ", isQuiet=false)";
    }
}
