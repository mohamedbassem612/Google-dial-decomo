package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class mjt extends aomh implements aonp {
    /* synthetic */ java.lang.Object a;
    /* synthetic */ java.lang.Object b;
    /* synthetic */ java.lang.Object c;
    final /* synthetic */ defpackage.mki d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjt(defpackage.mki mkiVar, aoln aolnVar) {
        super(4, aolnVar);
        this.d = mkiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        defpackage.mjt mjtVar = new defpackage.mjt(this.d, (aoln) obj4);
        mjtVar.a = (java.util.List) obj;
        mjtVar.b = (android.telecom.PhoneAccountHandle) obj2;
        mjtVar.c = (java.lang.Integer) obj3;
        return mjtVar.b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.mjs mjsVar;
        aooc.af(obj);
        ?? r6 = this.a;
        java.lang.Object obj2 = this.b;
        java.lang.Object obj3 = this.c;
        java.lang.Object obj4 = null;
        if (r6.size() < 2) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r6, 10));
        java.util.Iterator it = r6.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.mjs) it.next()).b);
        }
        if (obj3 != null && (mjsVar = (defpackage.mjs) ajsz.bH((java.util.List) r6, ((java.lang.Number) obj3).intValue())) != null) {
            obj4 = mjsVar.a;
        }
        if (obj4 == null) {
            obj4 = obj2;
        }
        return new defpackage.mjr(arrayList, defpackage.mki.c(r6, (android.telecom.PhoneAccountHandle) obj4), defpackage.mki.c(r6, (android.telecom.PhoneAccountHandle) obj2));
    }
}
