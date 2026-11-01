package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qiz implements defpackage.qil {
    public final defpackage.qid a;
    private final defpackage.qim b;

    public qiz(defpackage.qid qidVar, defpackage.qim qimVar) {
        this.a = qidVar;
        this.b = qimVar;
    }

    @Override // defpackage.qil
    public final defpackage.qim a() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qiz) {
            defpackage.qiz qizVar = (defpackage.qiz) obj;
            if (this.a == qizVar.a && this.b == qizVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "OngoingCallStyleNotificationParams(hangUpActionKey=" + this.a + ", priority=" + this.b + ')';
    }
}
