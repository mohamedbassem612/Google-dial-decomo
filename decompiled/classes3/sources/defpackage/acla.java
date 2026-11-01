package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acla {
    private final android.os.Bundle a;
    private final defpackage.ackw b;
    private final int c;

    public acla(android.os.Bundle bundle, int i, defpackage.ackw ackwVar) {
        this.a = bundle;
        this.c = 3;
        this.b = ackwVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.acla) {
            defpackage.acla aclaVar = (defpackage.acla) obj;
            android.os.Bundle bundle = this.a;
            if (bundle != null ? bundle.equals(aclaVar.a) : aclaVar.a == null) {
                int i = this.c;
                int i2 = aclaVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(aclaVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        android.os.Bundle bundle = this.a;
        return (((((bundle == null ? 0 : bundle.hashCode()) ^ 1000003) * (-721379959)) ^ a.aq(this.c)) * 1000003) ^ this.b.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.ackw ackwVar = this.b;
        return "IntentBuilderParams{initialExtras=" + java.lang.String.valueOf(this.a) + ", accountName=null, promoType=" + defpackage.abxl.i(this.c) + ", actionType=" + java.lang.String.valueOf(ackwVar) + '}';
    }

    public acla() {
        throw null;
    }
}
