package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ykq implements defpackage.ykp {
    public final java.util.List a;
    public final java.util.List b;
    public final cer c;
    public ok d;
    private final cer e;

    public ykq(java.util.List list) {
        aooh.f(list, "mutablePermissions");
        this.a = list;
        this.b = list;
        defpackage.xmr xmrVar = new defpackage.xmr(this, 6);
        ajxw ajxwVar = ceo.a;
        this.c = new cbk(xmrVar, (cen) null);
        this.e = new cbk(new defpackage.xmr(this, 7), (cen) null);
        new cbk(new defpackage.xmr(this, 8), (cen) null);
    }

    @Override // defpackage.ykp
    public final void a() {
        ok okVar = this.d;
        if (okVar == null) {
            throw new java.lang.IllegalStateException("ActivityResultLauncher cannot be null");
        }
        java.util.List list = this.b;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.yks) it.next()).b());
        }
        okVar.b(arrayList.toArray(new java.lang.String[0]));
    }

    @Override // defpackage.ykp
    public final boolean b() {
        return ((java.lang.Boolean) this.e.a()).booleanValue();
    }
}
