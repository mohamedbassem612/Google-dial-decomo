package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aojn extends aojo implements java.util.RandomAccess {
    private final aojo a;
    private final int b;
    private final int c;

    public aojn(aojo aojoVar, int i, int i2) {
        this.a = aojoVar;
        this.b = i;
        a.al(i, i2, aojoVar.a());
        this.c = i2 - i;
    }

    public final int a() {
        return this.c;
    }

    public final java.lang.Object get(int i) {
        a.aj(i, this.c);
        return this.a.get(this.b + i);
    }

    public final java.util.List subList(int i, int i2) {
        a.al(i, i2, this.c);
        aojo aojoVar = this.a;
        int i3 = this.b;
        return new defpackage.aojn(aojoVar, i + i3, i3 + i2);
    }
}
