package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rdo extends ahxt {
    public final /* bridge */ /* synthetic */ int a(java.lang.Object obj) {
        defpackage.qus qusVar = (defpackage.qus) obj;
        return j$.util.Objects.hash(new java.lang.Object[]{qusVar.e, java.lang.Integer.valueOf(qusVar.c), java.lang.Boolean.valueOf(qusVar.f)});
    }

    public final /* synthetic */ boolean b(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.qus qusVar = (defpackage.qus) obj;
        defpackage.qus qusVar2 = (defpackage.qus) obj2;
        return j$.util.Objects.equals(qusVar.e, qusVar2.e) && j$.util.Objects.equals(java.lang.Integer.valueOf(qusVar.c), java.lang.Integer.valueOf(qusVar2.c)) && j$.util.Objects.equals(java.lang.Boolean.valueOf(qusVar.f), java.lang.Boolean.valueOf(qusVar2.f));
    }
}
