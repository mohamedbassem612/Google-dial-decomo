package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public enum akjg implements alah {
    TEXT_SIZE_UNKNOWN(0),
    MATERIAL_SUBHEAD_1(1),
    MATERIAL_HEADLINE_5(2);

    public final int d;

    akjg(int i) {
        this.d = i;
    }

    public static defpackage.akjg b(int i) {
        if (i == 0) {
            return TEXT_SIZE_UNKNOWN;
        }
        if (i == 1) {
            return MATERIAL_SUBHEAD_1;
        }
        if (i != 2) {
            return null;
        }
        return MATERIAL_HEADLINE_5;
    }

    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.d);
    }
}
