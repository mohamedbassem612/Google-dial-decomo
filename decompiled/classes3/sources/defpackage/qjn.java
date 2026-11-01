package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qjn extends aomh implements aonj {
    final /* synthetic */ aoin a;
    final /* synthetic */ aihd b;
    final /* synthetic */ defpackage.zpo c;
    final /* synthetic */ zms d;
    final /* synthetic */ android.content.Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjn(aoin aoinVar, aihd aihdVar, defpackage.zpo zpoVar, zms zmsVar, android.content.Context context, aoln aolnVar) {
        super(1, aolnVar);
        this.a = aoinVar;
        this.b = aihdVar;
        this.c = zpoVar;
        this.d = zmsVar;
        this.e = context;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.qjn(this.a, this.b, this.c, this.d, this.e, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.qib qibVar;
        aooc.af(obj);
        java.util.Set set = ((java.lang.Boolean) this.a.a()).booleanValue() ? defpackage.qjp.c : defpackage.qjp.b;
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return null;
        }
        aihd aihdVar = this.b;
        if (!aihdVar.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aihdVar, 10));
            java.util.Iterator it = aihdVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.qiu) it.next()).a());
            }
            defpackage.qjp.a(arrayList);
            return null;
        }
        if (!set.contains(this.c)) {
            return null;
        }
        boolean zG = this.d.g();
        android.content.Context context = this.e;
        if (zG) {
            defpackage.qic qicVar = defpackage.qic.b;
            defpackage.qid qidVar = defpackage.qid.UNMUTE;
            int iA = urg.a(context);
            java.lang.String string = context.getString(2132019495);
            aooh.e(string, "getString(...)");
            qibVar = new defpackage.qib(qidVar, qicVar, string, null, new java.lang.Integer(iA), 2131231498, false, new java.lang.Integer(7));
        } else {
            defpackage.qic qicVar2 = defpackage.qic.b;
            defpackage.qid qidVar2 = defpackage.qid.MUTE;
            int iB = urg.b(context);
            java.lang.String string2 = context.getString(2132019496);
            aooh.e(string2, "getString(...)");
            qibVar = new defpackage.qib(qidVar2, qicVar2, string2, null, new java.lang.Integer(iB), 2131231499, false, new java.lang.Integer(6));
        }
        return qibVar;
    }
}
