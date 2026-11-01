package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gnv extends gnw {
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.gnv) {
            defpackage.gnv gnvVar = (defpackage.gnv) obj;
            if (((gnw) this).d == ((gnw) gnvVar).d && ((gnw) this).e == ((gnw) gnvVar).e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((gnw) this).d * 31) + ((gnw) this).e;
    }
}
