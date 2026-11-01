package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abku implements defpackage.aonj {
    final /* synthetic */ defpackage.aonn a;
    final /* synthetic */ java.util.List b;

    public abku(defpackage.aonn aonnVar, java.util.List list) {
        this.a = aonnVar;
        this.b = list;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int iIntValue = ((java.lang.Number) obj).intValue();
        return this.a.a(java.lang.Integer.valueOf(iIntValue), this.b.get(iIntValue));
    }
}
