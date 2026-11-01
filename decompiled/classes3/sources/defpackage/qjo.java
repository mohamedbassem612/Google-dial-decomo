package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qjo extends aomh implements aonj {
    final /* synthetic */ aihd a;
    final /* synthetic */ zms b;
    final /* synthetic */ defpackage.zpo c;
    final /* synthetic */ android.content.Context d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjo(aihd aihdVar, zms zmsVar, defpackage.zpo zpoVar, android.content.Context context, aoln aolnVar) {
        super(1, aolnVar);
        this.a = aihdVar;
        this.b = zmsVar;
        this.c = zpoVar;
        this.d = context;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.qjo(this.a, this.b, this.c, this.d, (aoln) obj).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.qib qibVar;
        aooc.af(obj);
        aihd aihdVar = this.a;
        if (!aihdVar.isEmpty()) {
            java.util.Set set = defpackage.qjp.a;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aihdVar, 10));
            java.util.Iterator it = aihdVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.qiw) it.next()).a());
            }
            defpackage.qjp.a(arrayList);
            return null;
        }
        zms zmsVar = this.b;
        defpackage.zmw zmwVarA = zmsVar.a();
        defpackage.zmw zmwVar = defpackage.zmw.ROUTE_SPEAKER;
        if (zmwVarA != zmwVar && zmsVar.a() != defpackage.zmw.ROUTE_EARPIECE && zmsVar.a() != defpackage.zmw.ROUTE_WIRED_HEADSET) {
            return null;
        }
        defpackage.zpo zpoVar = this.c;
        if (zpoVar != defpackage.zpo.f && zpoVar != defpackage.zpo.e && zpoVar != defpackage.zpo.c) {
            return null;
        }
        defpackage.zmw zmwVarA2 = zmsVar.a();
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            android.content.Context context = this.d;
            if (zmwVarA2 == zmwVar) {
                defpackage.qic qicVar = defpackage.qic.a;
                java.lang.String string = context.getString(2132019499);
                aooh.e(string, "getString(...)");
                qibVar = new defpackage.qib(defpackage.qid.SPEAKER_OFF, qicVar, string, null, new java.lang.Integer(urg.a(context)), 2131232066, false, null);
            } else {
                defpackage.qic qicVar2 = defpackage.qic.a;
                java.lang.String string2 = context.getString(2132019499);
                aooh.e(string2, "getString(...)");
                qibVar = new defpackage.qib(defpackage.qid.SPEAKER_ON, qicVar2, string2, null, new java.lang.Integer(urg.b(context)), 2131232007, false, null);
            }
        } else {
            android.content.Context context2 = this.d;
            if (zmwVarA2 == zmwVar) {
                defpackage.qid qidVar = defpackage.qid.SPEAKER_OFF;
                defpackage.qic qicVar3 = defpackage.qic.c;
                java.lang.String string3 = context2.getString(2132019497);
                aooh.e(string3, "getString(...)");
                qibVar = new defpackage.qib(qidVar, qicVar3, string3, null, null, 2131232066, false, null);
            } else {
                defpackage.qid qidVar2 = defpackage.qid.SPEAKER_ON;
                defpackage.qic qicVar4 = defpackage.qic.c;
                java.lang.String string4 = context2.getString(2132019498);
                aooh.e(string4, "getString(...)");
                qibVar = new defpackage.qib(qidVar2, qicVar4, string4, null, null, 2131232007, false, null);
            }
        }
        return qibVar;
    }
}
