package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acbu extends aomh implements aonn {
    int a;
    final /* synthetic */ com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver b;
    final /* synthetic */ java.util.List c;
    final /* synthetic */ java.lang.String d;
    final /* synthetic */ akhl e;
    private /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acbu(com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver testingToolsBroadcastReceiver, java.util.List list, java.lang.String str, akhl akhlVar, aoln aolnVar) {
        super(2, aolnVar);
        this.b = testingToolsBroadcastReceiver;
        this.c = list;
        this.d = str;
        this.e = akhlVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x009e  */
    public final java.lang.Object b(java.lang.Object obj) {
        aoss aossVar;
        aoss aossVar2;
        aolu aoluVar = aolu.a;
        if (this.a == 0) {
            aooc.af(obj);
            aossVar = (aoss) this.f;
            if (angy.c()) {
                abzy abzyVarB = this.b.b();
                this.f = aossVar;
                this.a = 1;
                java.lang.Object objA = abzyVarB.a(this);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                aossVar2 = aossVar;
                obj = objA;
            }
            if (angy.d()) {
                java.util.List list = this.c;
                com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver testingToolsBroadcastReceiver = this.b;
                ajcq ajcqVarA = ((acgr) testingToolsBroadcastReceiver.z().o((java.lang.String) null)).a();
                aooh.e(ajcqVarA, "clearAll(...)");
                aosy aosyVarAm = aoov.am(aossVar, 0, new defpackage.acbt(ajcqVarA, (aoln) null, 3, (char[]) null), 3);
                aosyVarAm.p(new abli(ajcqVarA, 5));
                list.add(aosyVarAm);
                ajcq ajcqVarA2 = ((acgr) testingToolsBroadcastReceiver.y().o((java.lang.String) null)).a();
                aooh.e(ajcqVarA2, "clearAll(...)");
                aosy aosyVarAm2 = aoov.am(aossVar, 0, new defpackage.acbt(ajcqVarA2, (aoln) null, 4, (short[]) null), 3);
                aosyVarAm2.p(new abli(ajcqVarA2, 6));
                list.add(aosyVarAm2);
            }
            java.util.List list2 = this.c;
            com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver testingToolsBroadcastReceiver2 = this.b;
            java.lang.String str = this.d;
            akhl akhlVar = this.e;
            ajcq ajcqVarD = ((acgr) testingToolsBroadcastReceiver2.z().o(str)).d(defpackage.abxl.q(akhlVar), akhlVar);
            aooh.e(ajcqVarD, "put(...)");
            aosy aosyVarAm3 = aoov.am(aossVar, 0, new defpackage.acbt(ajcqVarD, (aoln) null, 5, (int[]) null), 3);
            aosyVarAm3.p(new abli(ajcqVarD, 2));
            return java.lang.Boolean.valueOf(list2.add(aosyVarAm3));
        }
        aossVar2 = (aoss) this.f;
        aooc.af(obj);
        for (java.lang.String str2 : (java.util.List) obj) {
            java.util.List list3 = this.c;
            com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver testingToolsBroadcastReceiver3 = this.b;
            ajcq ajcqVarA3 = ((acgr) testingToolsBroadcastReceiver3.z().o(str2)).a();
            aooh.e(ajcqVarA3, "clearAll(...)");
            aosy aosyVarAm4 = aoov.am(aossVar2, 0, new defpackage.acbt(ajcqVarA3, (aoln) null, 0), 3);
            aosyVarAm4.p(new abli(ajcqVarA3, 3));
            list3.add(aosyVarAm4);
            ajcq ajcqVarA4 = ((acgr) testingToolsBroadcastReceiver3.y().o(str2)).a();
            aooh.e(ajcqVarA4, "clearAll(...)");
            aosy aosyVarAm5 = aoov.am(aossVar2, 0, new defpackage.acbt(ajcqVarA4, (aoln) null, 2, (byte[]) null), 3);
            aosyVarAm5.p(new abli(ajcqVarA4, 4));
            list3.add(aosyVarAm5);
        }
        aossVar = aossVar2;
        if (angy.d()) {
            java.util.List list4 = this.c;
            com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver testingToolsBroadcastReceiver4 = this.b;
            ajcq ajcqVarA5 = ((acgr) testingToolsBroadcastReceiver4.z().o((java.lang.String) null)).a();
            aooh.e(ajcqVarA5, "clearAll(...)");
            aosy aosyVarAm6 = aoov.am(aossVar, 0, new defpackage.acbt(ajcqVarA5, (aoln) null, 3, (char[]) null), 3);
            aosyVarAm6.p(new abli(ajcqVarA5, 5));
            list4.add(aosyVarAm6);
            ajcq ajcqVarA6 = ((acgr) testingToolsBroadcastReceiver4.y().o((java.lang.String) null)).a();
            aooh.e(ajcqVarA6, "clearAll(...)");
            aosy aosyVarAm7 = aoov.am(aossVar, 0, new defpackage.acbt(ajcqVarA6, (aoln) null, 4, (short[]) null), 3);
            aosyVarAm7.p(new abli(ajcqVarA6, 6));
            list4.add(aosyVarAm7);
        }
        java.util.List list5 = this.c;
        com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver testingToolsBroadcastReceiver5 = this.b;
        java.lang.String str3 = this.d;
        akhl akhlVar2 = this.e;
        ajcq ajcqVarD2 = ((acgr) testingToolsBroadcastReceiver5.z().o(str3)).d(defpackage.abxl.q(akhlVar2), akhlVar2);
        aooh.e(ajcqVarD2, "put(...)");
        aosy aosyVarAm8 = aoov.am(aossVar, 0, new defpackage.acbt(ajcqVarD2, (aoln) null, 5, (int[]) null), 3);
        aosyVarAm8.p(new abli(ajcqVarD2, 2));
        return java.lang.Boolean.valueOf(list5.add(aosyVarAm8));
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.acbu acbuVar = new defpackage.acbu(this.b, this.c, this.d, this.e, aolnVar);
        acbuVar.f = obj;
        return acbuVar;
    }
}
