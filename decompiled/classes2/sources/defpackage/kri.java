package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kri implements defpackage.krj {
    public final int a = 1;

    public kri(int i) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kri)) {
            return false;
        }
        int i = ((defpackage.kri) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final java.lang.String toString() {
        return "ActionSucceeded(targetApp=" + ((java.lang.Object) defpackage.hhb.z(1)) + ')';
    }
}
