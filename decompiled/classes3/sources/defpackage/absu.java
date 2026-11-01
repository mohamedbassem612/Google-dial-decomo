package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class absu {
    public final int a;

    private absu() {
        this.a = 1;
    }

    public static defpackage.absu a() {
        j$.util.Optional.empty();
        return new defpackage.absu();
    }

    public final int b() {
        int i = this.a;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public absu(int i) {
        this.a = i;
    }
}
