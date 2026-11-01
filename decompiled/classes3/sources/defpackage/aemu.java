package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aemu extends defpackage.aenb {
    private final aadl a;
    private final com.google.android.gms.common.api.Status b;

    public aemu(aadl aadlVar, com.google.android.gms.common.api.Status status) {
        if (aadlVar == null) {
            throw new java.lang.NullPointerException("Null result");
        }
        this.a = aadlVar;
        if (status == null) {
            throw new java.lang.NullPointerException("Null status");
        }
        this.b = status;
    }

    @Override // defpackage.aenb
    public final aadl a() {
        return this.a;
    }

    @Override // defpackage.aenb
    public final com.google.android.gms.common.api.Status b() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aenb) {
            defpackage.aenb aenbVar = (defpackage.aenb) obj;
            if (this.a.equals(aenbVar.a()) && this.b.equals(aenbVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
