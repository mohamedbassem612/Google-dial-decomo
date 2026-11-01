package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aova implements defpackage.aome {
    final /* synthetic */ int a;
    final /* synthetic */ java.util.List b;

    public aova(int i, java.util.List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.aome
    public final java.lang.StackTraceElement cJ() {
        return (java.lang.StackTraceElement) this.b.get(this.a);
    }

    @Override // defpackage.aome
    public final defpackage.aome cK() {
        return defpackage.aooc.N(this.b, this.a + 1);
    }
}
