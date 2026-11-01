package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acnj implements acni {
    public final java.util.List a;
    public final int b;
    private final int c;

    public acnj(int i, java.util.List list, int i2) {
        this.b = i;
        this.a = j$.util.DesugarCollections.unmodifiableList(list);
        this.c = i2;
        if (i == 3) {
            ahvr.bM(i2 == -1);
        } else {
            ahvr.bM(i2 != -1);
        }
    }

    public final /* synthetic */ acmi a() {
        return abrz.e(this);
    }

    public final java.util.List b() {
        return this.a;
    }

    public final int c() {
        int i = this.b;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        ahvr.bY(z);
        return this.c;
    }
}
