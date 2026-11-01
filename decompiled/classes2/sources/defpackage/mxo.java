package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mxo extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;
    private final amzg m;
    private final amzg n;
    private final amzg o;
    private final amzg p;
    private final amyz q;
    private final amzg r;
    private final amyz s;
    private final amyz t;
    private final amzg u;
    private final amzg v;
    private final amzg w;

    public mxo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13, amzg amzgVar14, amzg amzgVar15, amyz amyzVar3, amzg amzgVar16, amyz amyzVar4, amyz amyzVar5, amzg amzgVar17, amzg amzgVar18, amzg amzgVar19) {
        super(amyzVar2, new amzw(defpackage.mxo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amzs.b(amzgVar11);
        this.m = amzs.b(amzgVar12);
        this.n = amzs.b(amzgVar13);
        this.o = amzs.b(amzgVar14);
        this.p = amzs.b(amzgVar15);
        this.q = amyzVar3;
        this.r = amzs.b(amzgVar16);
        this.s = amyzVar4;
        this.t = amyzVar5;
        this.u = amzs.b(amzgVar17);
        this.v = amzs.b(amzgVar18);
        this.w = amzs.b(amzgVar19);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0184  */
    /* JADX WARN: Code duplicated, block: B:40:0x0192  */
    /* JADX WARN: Code duplicated, block: B:41:0x0196  */
    /* JADX WARN: Code duplicated, block: B:44:0x01db  */
    /* JADX WARN: Code duplicated, block: B:45:0x01de  */
    /* JADX WARN: Code duplicated, block: B:48:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x01f2  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        boolean z;
        boolean z2;
        int i;
        java.util.List list;
        java.util.List list2;
        qil qjaVar;
        java.util.List list3 = (java.util.List) obj;
        java.lang.String str = (java.lang.String) list3.get(0);
        java.util.List list4 = (aify) list3.get(1);
        android.content.Context context = (android.content.Context) list3.get(2);
        aify aifyVar = (aify) list3.get(3);
        qin qinVar = (qin) list3.get(4);
        j$.util.Optional optional = (j$.util.Optional) list3.get(5);
        j$.util.Optional optional2 = (j$.util.Optional) list3.get(6);
        j$.util.Optional optional3 = (j$.util.Optional) list3.get(7);
        qiy qiyVar = (qiy) list3.get(8);
        j$.util.Optional optional4 = (j$.util.Optional) list3.get(9);
        j$.util.Optional optional5 = (j$.util.Optional) list3.get(10);
        boolean zBooleanValue = ((java.lang.Boolean) list3.get(11)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list3.get(12)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list3.get(13)).booleanValue();
        defpackage.nmo nmoVar = (defpackage.nmo) list3.get(14);
        j$.util.Optional optional6 = (j$.util.Optional) list3.get(15);
        defpackage.nhq nhqVar = (defpackage.nhq) list3.get(16);
        boolean zBooleanValue4 = ((java.lang.Boolean) list3.get(17)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list3.get(18)).booleanValue();
        aooh.f(str, "callId");
        aooh.f(list4, "personReferences");
        aooh.f(context, "appContext");
        aooh.f(aifyVar, "actionButtons");
        aooh.f(qinVar, "content");
        aooh.f(optional, "largeIcon");
        aooh.f(optional2, "contentIntent");
        aooh.f(optional3, "fullScreenIntent");
        aooh.f(qiyVar, "notificationWhen");
        aooh.f(optional4, "notificationProgress");
        aooh.f(optional5, "notificationChannelId");
        aooh.f(nmoVar, "lifecycleState");
        amyz amyzVar = this.q;
        aooh.f(amyzVar, "androidAutoModelSeparationEnabled");
        aooh.f(optional6, "androidAutoNotificationModel");
        amyz amyzVar2 = this.s;
        aooh.f(amyzVar2, "enableAgenticCallScreen");
        amyz amyzVar3 = this.t;
        aooh.f(amyzVar3, "gacsUseGeminiBranding");
        aooh.f(nhqVar, "dobbySession");
        boolean z3 = zBooleanValue3 && zBooleanValue2;
        boolean z4 = (nmoVar == defpackage.nmo.AUTO_SCREENING || nmoVar == defpackage.nmo.AUTO_SCREENING_WITH_UI) && ((java.lang.Boolean) amyzVar2.a()).booleanValue() && ((java.lang.Boolean) amyzVar3.a()).booleanValue();
        if (zBooleanValue4) {
            z = z4;
            boolean z5 = nhqVar.w == defpackage.nje.e;
            boolean z6 = ((!zBooleanValue5 && z5) || (((java.lang.Boolean) amyzVar3.a()).booleanValue() && ((java.lang.Boolean) amyzVar2.a()).booleanValue())) && nmoVar == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI;
            if (!z || z6) {
                z2 = true;
            } else {
                z2 = false;
            }
            qit qitVar = qit.b;
            qir qirVar = (qir) aooh.q(optional);
            if (z2) {
                i = 2131231037;
            } else {
                i = 2131232042;
            }
            int iC = urg.c(context, 2130969018);
            list = aokc.a;
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) aooh.q(optional2);
            android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) aooh.q(optional3);
            qiv qivVar = (qiv) aooh.q(optional4);
            int i2 = !((java.lang.Boolean) amyzVar.a()).booleanValue() ? 1 : 0;
            java.lang.String str2 = (java.lang.String) aooh.q(optional5);
            boolean z7 = !((java.lang.Boolean) amyzVar.a()).booleanValue();
            if (z3) {
                list2 = list4;
            } else {
                list2 = list;
            }
            if (nmoVar == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                qjaVar = new qip(qid.e, qid.c, qim.d);
            } else {
                qjaVar = new qja(qid.c, qid.e, z3, qim.d);
            }
            j$.util.Optional optionalOf = j$.util.Optional.of(new qjd(qitVar, str, aifyVar, list, qinVar, qirVar, i, qiyVar, str2, (pdv) null, iC, false, 2, i2, list2, "call", pendingIntent, pendingIntent2, qivVar, zBooleanValue, qjaVar, (qij) null, false, false, z7, false, z2, (qie) aooh.q(optional6), 35652096));
            aooh.e(optionalOf, "of(...)");
            return aiql.z(optionalOf);
        }
        z = z4;
        if (zBooleanValue5) {
        }
        if (z) {
            z2 = true;
        } else {
            z2 = true;
        }
        qit qitVar2 = qit.b;
        qir qirVar2 = (qir) aooh.q(optional);
        if (z2) {
            i = 2131231037;
        } else {
            i = 2131232042;
        }
        int iC2 = urg.c(context, 2130969018);
        list = aokc.a;
        android.app.PendingIntent pendingIntent3 = (android.app.PendingIntent) aooh.q(optional2);
        android.app.PendingIntent pendingIntent4 = (android.app.PendingIntent) aooh.q(optional3);
        qiv qivVar2 = (qiv) aooh.q(optional4);
        int i3 = !((java.lang.Boolean) amyzVar.a()).booleanValue() ? 1 : 0;
        java.lang.String str3 = (java.lang.String) aooh.q(optional5);
        boolean z8 = !((java.lang.Boolean) amyzVar.a()).booleanValue();
        if (z3) {
            list2 = list;
        } else {
            list2 = list4;
        }
        if (nmoVar == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
            qjaVar = new qip(qid.e, qid.c, qim.d);
        } else {
            qjaVar = new qja(qid.c, qid.e, z3, qim.d);
        }
        j$.util.Optional optionalOf2 = j$.util.Optional.of(new qjd(qitVar2, str, aifyVar, list, qinVar, qirVar2, i, qiyVar, str3, (pdv) null, iC2, false, 2, i3, list2, "call", pendingIntent3, pendingIntent4, qivVar2, zBooleanValue, qjaVar, (qij) null, false, false, z8, false, z2, (qie) aooh.q(optional6), 35652096));
        aooh.e(optionalOf2, "of(...)");
        return aiql.z(optionalOf2);
    }

    protected final ajcq c() {
        amzg amzgVar = this.w;
        amzg amzgVar2 = this.v;
        amzg amzgVar3 = this.u;
        amzg amzgVar4 = this.r;
        amzg amzgVar5 = this.p;
        amzg amzgVar6 = this.o;
        amzg amzgVar7 = this.n;
        amzg amzgVar8 = this.m;
        amzg amzgVar9 = this.l;
        amzg amzgVar10 = this.k;
        amzg amzgVar11 = this.j;
        amzg amzgVar12 = this.i;
        amzg amzgVar13 = this.h;
        amzg amzgVar14 = this.g;
        amzg amzgVar15 = this.f;
        amzg amzgVar16 = this.e;
        amzg amzgVar17 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar17.d(), amzgVar16.d(), amzgVar15.d(), amzgVar14.d(), amzgVar13.d(), amzgVar12.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
