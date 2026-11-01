package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fah {
    public static final defpackage.fah a;
    public final int b;
    public final int c;
    public final aihd d;

    static {
        defpackage.fah fahVar;
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            aihb aihbVar = new aihb();
            for (int i = 1; i <= 10; i++) {
                aihbVar.i(java.lang.Integer.valueOf(eum.g(i)));
            }
            fahVar = new defpackage.fah(2, (java.util.Set) aihbVar.h());
        } else {
            fahVar = new defpackage.fah(2, 10);
        }
        a = fahVar;
    }

    public fah(int i, java.util.Set set) {
        this.b = i;
        aihd aihdVarO = aihd.o(set);
        this.d = aihdVarO;
        ailj ailjVarK = aihdVarO.k();
        int iMax = 0;
        while (ailjVarK.hasNext()) {
            iMax = java.lang.Math.max(iMax, java.lang.Integer.bitCount(((java.lang.Integer) ailjVarK.next()).intValue()));
        }
        this.c = iMax;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.fah) {
            defpackage.fah fahVar = (defpackage.fah) obj;
            if (this.b == fahVar.b && this.c == fahVar.c && j$.util.Objects.equals(this.d, fahVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        aihd aihdVar = this.d;
        return (((this.b * 31) + this.c) * 31) + (aihdVar == null ? 0 : aihdVar.hashCode());
    }

    public final java.lang.String toString() {
        return "AudioProfile[format=" + this.b + ", maxChannelCount=" + this.c + ", channelMasks=" + java.lang.String.valueOf(this.d) + ']';
    }

    public fah(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = null;
    }
}
