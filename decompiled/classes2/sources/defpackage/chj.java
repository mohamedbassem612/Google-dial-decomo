package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class chj extends aojo implements j$.util.List, chk {
    private final chk a;
    private final int b;
    private final int c;
    private final int d;

    public chj(chk chkVar, int i, int i2) {
        this.a = chkVar;
        this.b = i;
        this.c = i2;
        a.al(i, i2, chkVar.size());
        this.d = i2 - i;
    }

    public final int a() {
        return this.d;
    }

    public final java.lang.Object get(int i) {
        a.aj(i, this.d);
        return this.a.get(this.b + i);
    }

    public final /* synthetic */ java.util.List subList(int i, int i2) {
        a.al(i, i2, this.d);
        chk chkVar = this.a;
        int i3 = this.b;
        return new defpackage.chj(chkVar, i + i3, i3 + i2);
    }
}
