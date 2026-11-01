package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bv {
    public int a;
    public defpackage.aw b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public defpackage.emq h;
    public defpackage.emq i;

    public bv(defpackage.aw awVar, defpackage.emq emqVar) {
        this.a = 10;
        this.b = awVar;
        this.c = false;
        this.h = awVar.aa;
        this.i = emqVar;
    }

    public bv(int i, defpackage.aw awVar) {
        this.a = i;
        this.b = awVar;
        this.c = false;
        defpackage.emq emqVar = defpackage.emq.e;
        this.h = emqVar;
        this.i = emqVar;
    }

    public bv(int i, defpackage.aw awVar, byte[] bArr) {
        this.a = i;
        this.b = awVar;
        this.c = true;
        defpackage.emq emqVar = defpackage.emq.e;
        this.h = emqVar;
        this.i = emqVar;
    }

    public bv() {
    }
}
