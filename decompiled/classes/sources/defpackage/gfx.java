package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gfx extends defpackage.aoof implements defpackage.aonn {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfx(java.lang.Object obj, int i, byte[] bArr) {
        super(2, obj, defpackage.ani.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
        this.$cid = i;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        boolean zB;
        int i = this.$cid;
        if (i == 0) {
            return defpackage.gfz.b((defpackage.gfy) this.e, (defpackage.aonj) obj, (defpackage.aoln) obj2);
        }
        if (i == 1) {
            defpackage.cpe cpeVar = (defpackage.cpe) obj;
            defpackage.cpe cpeVar2 = (defpackage.cpe) obj2;
            defpackage.ani aniVar = (defpackage.ani) this.e;
            if (aniVar.D && (zB = cpeVar2.b()) != cpeVar.b()) {
                defpackage.aonj aonjVar = aniVar.a;
                if (aonjVar != null) {
                    aonjVar.a(java.lang.Boolean.valueOf(zB));
                }
                if (zB) {
                    defpackage.aoov.an(aniVar.M(), null, 4, new ahb(aniVar, (defpackage.aoln) null, 10), 1);
                    defpackage.bek bekVarA = aniVar.a();
                    if (bekVarA != null) {
                        bekVarA.d();
                    } else {
                        bekVarA = null;
                    }
                    aniVar.c = bekVarA;
                } else {
                    defpackage.bek bekVar = aniVar.c;
                    if (bekVar != null) {
                        bekVar.a();
                    }
                    aniVar.c = null;
                }
                defpackage.cfo.A(aniVar).I();
                defpackage.kaw kawVar = aniVar.e;
                if (kawVar != null) {
                    if (zB) {
                        defpackage.avd avdVar = aniVar.b;
                        if (avdVar != null) {
                            aniVar.b(kawVar, new ave(avdVar));
                            aniVar.b = null;
                        }
                        defpackage.avd avdVar2 = new defpackage.avd();
                        aniVar.b(kawVar, avdVar2);
                        aniVar.b = avdVar2;
                    } else {
                        defpackage.avd avdVar3 = aniVar.b;
                        if (avdVar3 != null) {
                            aniVar.b(kawVar, new ave(avdVar3));
                            aniVar.b = null;
                        }
                    }
                }
            }
            return defpackage.aojh.a;
        }
        int iIntValue = ((java.lang.Number) obj).intValue();
        int iIntValue2 = ((java.lang.Number) obj2).intValue();
        defpackage.unb unbVar = (defpackage.unb) this.e;
        if (iIntValue >= 0 && iIntValue2 >= 0 && iIntValue < unbVar.f.size() && iIntValue2 < unbVar.f.size() && iIntValue != iIntValue2) {
            java.util.List listCb = defpackage.ajsz.cb(unbVar.f);
            listCb.add(iIntValue2, listCb.remove(iIntValue));
            defpackage.aozj aozjVar = unbVar.i;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listCb, 10));
            java.util.Iterator it = listCb.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    defpackage.ajsz.bh();
                }
                umy umyVar = (umy) next;
                long j = umyVar.a;
                java.lang.String str = umyVar.b;
                long j2 = umyVar.c;
                int i4 = umyVar.d;
                java.lang.String str2 = umyVar.e;
                android.net.Uri uri = umyVar.f;
                unf unfVar = umyVar.g;
                java.util.List list = umyVar.h;
                boolean z = umyVar.i;
                boolean z2 = umyVar.j;
                int i5 = umyVar.l;
                defpackage.aooh.f(str, "lookUpKey");
                defpackage.aooh.f(str2, "name");
                arrayList.add(new umy(j, str, j2, i4, str2, uri, unfVar, list, z, z2, i2, i5));
                it = it;
                i2 = i3;
            }
            aozjVar.e(arrayList);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfx(java.lang.Object obj, int i) {
        super(2, obj, defpackage.gfz.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfx(java.lang.Object obj, int i, char[] cArr) {
        super(2, obj, defpackage.unb.class, "onMove", "onMove(II)V", 0);
        this.$cid = i;
    }
}
