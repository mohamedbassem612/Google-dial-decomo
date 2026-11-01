package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kgo {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;
    public final java.lang.Object d;

    public kgo(zzx zzxVar, aoss aossVar) {
        aooh.f(aossVar, "lightweightScope");
        this.a = zzxVar;
        this.b = aossVar;
        this.d = new apdp();
        java.util.Set setEntrySet = zzxVar.k().entrySet();
        aooh.e(setEntrySet, "<get-entries>(...)");
        java.util.List<java.util.Map.Entry> listBX = ajsz.bX(setEntrySet, new defpackage.hte(5));
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBX, 10));
        for (java.util.Map.Entry entry : listBX) {
            aooh.c(entry);
            kgc kgcVar = (kgc) entry.getKey();
            aoin aoinVar = (aoin) entry.getValue();
            aooh.c(kgcVar);
            arrayList.add(new defpackage.kgb(kgcVar, kgcVar == kgc.a, ((kfy) aoinVar.a()).a().a));
        }
        this.c = arrayList;
    }

    public static final java.util.Set f(kiu kiuVar) {
        defpackage.kis kisVar = kiuVar.u;
        if (kisVar == null) {
            kisVar = defpackage.kis.a;
        }
        alan alanVar = kisVar.b;
        aooh.e(alanVar, "getCoalescedIdList(...)");
        return ajsz.cf(alanVar);
    }

    public static final void g(bw bwVar, kiu kiuVar) {
        aw awVarB;
        java.lang.String str;
        if (kiuVar == null) {
            awVarB = new defpackage.lyx();
            amxr.g(awVarB);
            str = "EmptyConversationHistoryCallDetailsFragment";
        } else {
            awVarB = defpackage.lyi.b(kiuVar, true);
            str = "ConversationHistoryCallDetailsFragment";
        }
        bwVar.q(2131427867, awVarB, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable, java.lang.Object] */
    public final java.lang.Object a(kgc kgcVar, aoln aolnVar) {
        defpackage.kgn kgnVar;
        kgc kgcVar2;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.kgn) {
            kgnVar = (defpackage.kgn) aolnVar;
            int i = kgnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kgnVar.c = i - Integer.MIN_VALUE;
            } else {
                kgnVar = new defpackage.kgn(this, aolnVar);
            }
        } else {
            kgnVar = new defpackage.kgn(this, aolnVar);
        }
        java.lang.Object obj2 = kgnVar.a;
        aojh aojhVar = aolu.a;
        int i2 = kgnVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                java.lang.Object obj3 = this.d;
                kgnVar.d = kgcVar;
                apdp apdpVar = (apdp) obj3;
                kgnVar.e = apdpVar;
                kgnVar.c = 1;
                if (apdpVar.b(kgnVar) != aojhVar) {
                    kgcVar2 = kgcVar;
                    obj = obj3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = kgnVar.e;
            kgcVar2 = kgnVar.d;
            aooc.af(obj2);
            ?? r7 = this.c;
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r7, 10));
            for (defpackage.kgb kgbVar : r7) {
                arrayList.add(kgbVar.a == kgcVar2 ? defpackage.kgb.a(kgbVar, true) : defpackage.kgb.a(kgbVar, false));
            }
            this.c = arrayList;
            aojhVar = aojh.a;
            return aojhVar;
        } finally {
            ((apdp) obj).d();
        }
    }

    public final defpackage.kna b() {
        defpackage.knb knbVar = (defpackage.knb) ((akzx) ((defpackage.ni) this.b).a).b;
        if ((knbVar.b & 1) == 0) {
            return null;
        }
        defpackage.kna knaVar = knbVar.c;
        return knaVar == null ? defpackage.kna.a : knaVar;
    }

    public final defpackage.lyb c() {
        defpackage.lyb lybVarE = ((az) this.a).a().e("ConversationHistoryCallDetailsFragment");
        if (lybVarE instanceof defpackage.lyb) {
            return lybVarE;
        }
        return null;
    }

    public final void d(defpackage.kna knaVar) {
        java.lang.Object obj = this.b;
        if (knaVar == null) {
            akzx akzxVar = (akzx) ((defpackage.ni) obj).a;
            akzxVar.u();
            defpackage.knb knbVar = (defpackage.knb) akzxVar.b;
            defpackage.knb knbVar2 = defpackage.knb.a;
            knbVar.c = null;
            knbVar.b &= -2;
            return;
        }
        akzx akzxVar2 = (akzx) ((defpackage.ni) obj).a;
        akzxVar2.u();
        defpackage.knb knbVar3 = (defpackage.knb) akzxVar2.b;
        defpackage.knb knbVar4 = defpackage.knb.a;
        j$.util.Objects.requireNonNull(knaVar);
        knbVar3.c = knaVar;
        knbVar3.b |= 1;
    }

    public final boolean e() {
        az azVar = (az) this.a;
        return (azVar.isFinishing() || azVar.isChangingConfigurations() || azVar.a().ac()) ? false : true;
    }

    public final defpackage.hku h() {
        aooc.an(this.c, android.view.View.class);
        android.view.View view = (android.view.View) this.c;
        his hisVar = (his) this.d;
        return new defpackage.hku((defpackage.him) this.b, (hkg) this.a, hisVar, view);
    }

    public kgo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.b = str;
        this.d = str2;
        this.a = str3;
    }

    public kgo(rhx rhxVar, defpackage.ni niVar, az azVar) {
        aooh.f(niVar, "callLogFragmentRetainedState");
        aooh.f(azVar, "activity");
        this.d = rhxVar;
        this.b = niVar;
        this.a = azVar;
    }

    public kgo(defpackage.him himVar, hkg hkgVar, his hisVar) {
        this.b = himVar;
        this.a = hkgVar;
        this.d = hisVar;
    }
}
