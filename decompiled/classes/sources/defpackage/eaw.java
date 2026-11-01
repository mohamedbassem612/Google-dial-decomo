package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eaw {
    static int a(int i) {
        int iM$3;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$3();
                } else if (i3 == 2) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m();
                } else if (i3 == 4) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$8();
                } else if (i3 == 8) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$7();
                } else if (i3 == 16) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$6();
                } else if (i3 == 32) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$5();
                } else if (i3 == 64) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$4();
                } else if (i3 == 128) {
                    iM$3 = baa$.ExternalSyntheticApiModelOutline1.m$1();
                } else if (i3 == 512) {
                    iM$3 = rp$.ExternalSyntheticApiModelOutline0.m();
                }
                i2 |= iM$3;
            }
        }
        return i2;
    }

    public static final void b(android.view.View view) {
        java.util.Iterator itA = new aoka(new bxr(view, (defpackage.aoln) null, 2), 3).a();
        while (itA.hasNext()) {
            f((android.view.View) itA.next()).al();
        }
    }

    public static final defpackage.ecx c(defpackage.efa efaVar, defpackage.efk efkVar, java.util.List list, defpackage.aoss aossVar, defpackage.aomy aomyVar) {
        if (list == null) {
            defpackage.aooh.i("migrations");
        }
        if (aossVar == null) {
            defpackage.aooh.i("scope");
        }
        defpackage.eeo eeoVar = new defpackage.eeo(efaVar, aomyVar);
        if (list == null) {
            defpackage.aooh.i("migrations");
        }
        if (aossVar == null) {
            defpackage.aooh.i("scope");
        }
        if (aossVar == null) {
            defpackage.aooh.i("scope");
        }
        defpackage.ecw ecwVar = new defpackage.ecw(eeoVar, aossVar.c().get(defpackage.aoub.d) == null ? aossVar.c().plus(new defpackage.aoud(null)) : aossVar.c());
        if (efkVar != null) {
            ecwVar.a = efkVar;
        }
        ecwVar.b(list);
        return ecwVar.a();
    }

    public static final defpackage.kaw f(android.view.View view) {
        defpackage.kaw kawVar = (defpackage.kaw) view.getTag(2131428703);
        if (kawVar != null) {
            return kawVar;
        }
        defpackage.kaw kawVar2 = new defpackage.kaw((byte[]) null, (byte[]) null, (byte[]) null);
        view.setTag(2131428703, kawVar2);
        return kawVar2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:22:0x005f->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [eda] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007f -> B:22:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0082 -> B:22:0x005f). Please report as a decompilation issue!!! */
    public final java.lang.Object e(java.util.List list, defpackage.eda edaVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        defpackage.ect ectVar;
        ?? r6;
        defpackage.aoot aootVar;
        ?? it;
        java.lang.Throwable th;
        defpackage.aonj aonjVar;
        if (aolnVar instanceof defpackage.ect) {
            ectVar = (defpackage.ect) aolnVar;
            int i = ectVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ectVar.d = i - Integer.MIN_VALUE;
            } else {
                ectVar = new defpackage.ect(this, aolnVar);
            }
        } else {
            ectVar = new defpackage.ect(this, aolnVar);
        }
        java.lang.Object obj = ectVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ectVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = ectVar.a;
                defpackage.aooc.af(obj);
                r6 = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = ectVar.b;
                aootVar = ectVar.e;
                try {
                    defpackage.aooc.af(obj);
                    it = it;
                } catch (java.lang.Throwable th2) {
                    java.lang.Object obj3 = aootVar.a;
                    if (obj3 == null) {
                        aootVar.a = th2;
                        it = it;
                    } else {
                        aoil.b((java.lang.Throwable) obj3, th2);
                        it = it;
                    }
                }
            }
            while (it.hasNext()) {
                aonjVar = (defpackage.aonj) it.next();
                ectVar.a = null;
                ectVar.e = aootVar;
                ectVar.b = it;
                ectVar.d = 2;
                if (aonjVar.a(ectVar) == aoluVar) {
                    return aoluVar;
                }
            }
            th = (java.lang.Throwable) aootVar.a;
            if (th == null) {
                return defpackage.aojh.a;
            }
            throw th;
        }
        defpackage.aooc.af(obj);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.ecu ecuVar = new defpackage.ecu(list, arrayList, null);
        ectVar.a = arrayList;
        ectVar.d = 1;
        if (edaVar.a(ecuVar, ectVar) == aoluVar) {
            return aoluVar;
        }
        r6 = arrayList;
        aootVar = new defpackage.aoot();
        it = r6.iterator();
        while (it.hasNext()) {
            aonjVar = (defpackage.aonj) it.next();
            ectVar.a = null;
            ectVar.e = aootVar;
            ectVar.b = it;
            ectVar.d = 2;
            if (aonjVar.a(ectVar) == aoluVar) {
                return aoluVar;
            }
        }
        th = (java.lang.Throwable) aootVar.a;
        if (th == null) {
            return defpackage.aojh.a;
        }
        throw th;
    }
}
