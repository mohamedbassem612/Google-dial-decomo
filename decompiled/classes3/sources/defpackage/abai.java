package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abai {
    public static final aimz a = aimz.i("com/google/android/libraries/abuse/hades/moirai/MoiraiApi");
    public final aazd b;
    public defpackage.abbw c;
    public final apdp d;
    public final defpackage.abaq e;
    public final acxg f;
    public final defpackage.vaa g;
    private final aosp h;
    private final defpackage.abcb i;
    private volatile boolean j;
    private final defpackage.rai k;

    public abai(aazd aazdVar, defpackage.rai raiVar, defpackage.vaa vaaVar, acxg acxgVar, aosp aospVar, aosp aospVar2, defpackage.abbx abbxVar, j$.util.Optional optional) {
        aooh.f(raiVar, "downloadManagerFactory");
        aooh.f(aospVar, "protectionManagementDispatcher");
        aooh.f(aospVar2, "classificationDispatcher");
        aooh.f(abbxVar, "moiraiMetadataProvider");
        aooh.f(optional, "tartarusExperimentsOptional");
        this.b = aazdVar;
        this.k = raiVar;
        this.g = vaaVar;
        this.f = acxgVar;
        this.h = aospVar2;
        this.i = (defpackage.abcb) aooh.q(optional);
        this.e = raiVar.q(aazdVar);
        this.d = new apdp();
    }

    private final java.lang.Object d(aazd aazdVar, int i) {
        abav abavVarL = this.f.l(aazdVar);
        if (abavVarL != null) {
            abavVarL.e(aazdVar, i);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006b  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) throws java.lang.Throwable {
        defpackage.abad abadVar;
        java.lang.Object obj;
        aazd aazdVar;
        defpackage.abbw abbwVar;
        java.lang.Object obj2;
        if (aolnVar instanceof defpackage.abad) {
            abadVar = (defpackage.abad) aolnVar;
            int i = abadVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                abadVar.d = i - Integer.MIN_VALUE;
            } else {
                abadVar = new defpackage.abad(this, aolnVar);
            }
        } else {
            abadVar = new defpackage.abad(this, aolnVar);
        }
        java.lang.Object objC = abadVar.b;
        aojh aojhVar = aolu.a;
        int i2 = abadVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else if (i2 == 2) {
                aooc.af(objC);
                obj = (defpackage.abbm) objC;
                if (obj != null) {
                    aazdVar = this.b;
                    abadVar.a = obj;
                    abadVar.d = 3;
                    if (d(aazdVar, 7) == aojhVar) {
                        return aojhVar;
                    }
                    abbwVar = this.c;
                    if (abbwVar == null) {
                        aooh.j("classifier");
                        abbwVar = null;
                    }
                    abadVar.a = obj;
                    abadVar.d = 4;
                    if (abbwVar.b((defpackage.abbm) obj, abadVar) == aojhVar) {
                        return aojhVar;
                    }
                    obj2 = obj;
                    abadVar.a = null;
                    abadVar.d = 5;
                    defpackage.abbm abbmVar = (defpackage.abbm) obj2;
                    a.b().l("com/google/android/libraries/abuse/hades/moirai/MoiraiApi", "logProtections", 322, "MoiraiApi.kt").H("Loaded protections with protection token: %s, release config id: %s", aish.g.f().k(abbmVar.D().D()), abbmVar.C());
                    if (aojh.a == aojhVar) {
                        return aojhVar;
                    }
                }
            } else if (i2 == 3) {
                java.lang.Object obj3 = abadVar.a;
                aooc.af(objC);
                obj = obj3;
                abbwVar = this.c;
                if (abbwVar == null) {
                    aooh.j("classifier");
                    abbwVar = null;
                }
                abadVar.a = obj;
                abadVar.d = 4;
                if (abbwVar.b((defpackage.abbm) obj, abadVar) == aojhVar) {
                    return aojhVar;
                }
                obj2 = obj;
                abadVar.a = null;
                abadVar.d = 5;
                defpackage.abbm abbmVar2 = (defpackage.abbm) obj2;
                a.b().l("com/google/android/libraries/abuse/hades/moirai/MoiraiApi", "logProtections", 322, "MoiraiApi.kt").H("Loaded protections with protection token: %s, release config id: %s", aish.g.f().k(abbmVar2.D().D()), abbmVar2.C());
                if (aojh.a == aojhVar) {
                    return aojhVar;
                }
            } else if (i2 == 4) {
                obj2 = abadVar.a;
                aooc.af(objC);
                abadVar.a = null;
                abadVar.d = 5;
                defpackage.abbm abbmVar3 = (defpackage.abbm) obj2;
                a.b().l("com/google/android/libraries/abuse/hades/moirai/MoiraiApi", "logProtections", 322, "MoiraiApi.kt").H("Loaded protections with protection token: %s, release config id: %s", aish.g.f().k(abbmVar3.D().D()), abbmVar3.C());
                if (aojh.a == aojhVar) {
                    return aojhVar;
                }
            } else {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return aojh.a;
        }
        aooc.af(objC);
        abadVar.d = 1;
        if (c(abadVar) == aojhVar) {
            return aojhVar;
        }
        defpackage.abaq abaqVar = this.e;
        abadVar.d = 2;
        objC = abaqVar.c(abadVar);
        if (objC == aojhVar) {
            return aojhVar;
        }
        obj = (defpackage.abbm) objC;
        if (obj != null) {
            aazdVar = this.b;
            abadVar.a = obj;
            abadVar.d = 3;
            if (d(aazdVar, 7) == aojhVar) {
                return aojhVar;
            }
            abbwVar = this.c;
            if (abbwVar == null) {
                aooh.j("classifier");
                abbwVar = null;
            }
            abadVar.a = obj;
            abadVar.d = 4;
            if (abbwVar.b((defpackage.abbm) obj, abadVar) == aojhVar) {
                return aojhVar;
            }
            obj2 = obj;
            abadVar.a = null;
            abadVar.d = 5;
            defpackage.abbm abbmVar4 = (defpackage.abbm) obj2;
            a.b().l("com/google/android/libraries/abuse/hades/moirai/MoiraiApi", "logProtections", 322, "MoiraiApi.kt").H("Loaded protections with protection token: %s, release config id: %s", aish.g.f().k(abbmVar4.D().D()), abbmVar4.C());
            if (aojh.a == aojhVar) {
                return aojhVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:60:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [abav] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5, types: [abav] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v2, types: [abba] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public final java.lang.Object b(defpackage.abba abbaVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.abae abaeVar;
        java.util.List listA;
        java.lang.Object obj;
        aazd aazdVar;
        java.lang.String strD;
        abav abavVarL;
        java.lang.Object objL;
        ahzh ahzhVarB;
        java.lang.Throwable th;
        aazd aazdVar2;
        ahzh ahzhVar;
        ?? r8;
        ?? r7;
        aazd aazdVar3;
        ?? r0;
        java.lang.Object objAj;
        if (aolnVar instanceof defpackage.abae) {
            abaeVar = (defpackage.abae) aolnVar;
            int i = abaeVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                abaeVar.f = i - Integer.MIN_VALUE;
            } else {
                abaeVar = new defpackage.abae(this, aolnVar);
            }
        } else {
            abaeVar = new defpackage.abae(this, aolnVar);
        }
        java.lang.Object obj2 = abaeVar.d;
        aolu aoluVar = aolu.a;
        int i2 = abaeVar.f;
        try {
            if (i2 == 0) {
                aooc.af(obj2);
                boolean z = this.j;
                defpackage.abcb abcbVar = this.i;
                if (abcbVar == null || (listA = abcbVar.a()) == null) {
                    listA = aokc.a;
                }
                if (!listA.isEmpty()) {
                    abbaVar = abbaVar.a(listA);
                }
                defpackage.abbf abbfVarB = abbaVar.b();
                aazd aazdVar4 = this.b;
                if (abbfVarB != null && ((strD = aazdVar4.d()) == null || strD.length() == 0)) {
                    aazdVar4 = new aazd(abbfVarB.a, aazdVar4.b, aazdVar4.a);
                }
                abaeVar.a = abbaVar;
                abaeVar.g = aazdVar4;
                abaeVar.f = 1;
                if (d(aazdVar4, 6) != aoluVar) {
                    obj = abbaVar;
                    aazdVar = aazdVar4;
                }
                return aoluVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(obj2);
                    return obj2;
                }
                ahzhVar = abaeVar.i;
                objL = abaeVar.c;
                aazd aazdVar5 = abaeVar.h;
                java.lang.Object obj3 = abaeVar.b;
                aazd aazdVar6 = abaeVar.g;
                java.lang.Object obj4 = abaeVar.a;
                try {
                    aooc.af(obj2);
                    r8 = obj4;
                    r7 = obj3;
                    aazdVar3 = aazdVar6;
                    aosp aospVar = this.h;
                    defpackage.abaf abafVar = new defpackage.abaf(aazdVar3, this, r7, r8, null);
                    abaeVar.a = null;
                    abaeVar.g = null;
                    abaeVar.b = null;
                    abaeVar.h = null;
                    abaeVar.c = null;
                    abaeVar.i = null;
                    abaeVar.f = 3;
                    objAj = aoov.aj(aospVar, abafVar, abaeVar);
                    if (objAj != aoluVar) {
                        return objAj;
                    }
                    return aoluVar;
                } catch (abbe e) {
                    th = e;
                    aazdVar2 = aazdVar5;
                    r0 = objL;
                    if (r0 != 0) {
                        throw th;
                    }
                    r0.b(aazdVar2, ((abbe) th).c, ((abbe) th).d, ahzhVar.a(java.util.concurrent.TimeUnit.MILLISECONDS), ((abbe) th).e, ((abbe) th).a, ((abbe) th).b);
                    throw th;
                }
            }
            aazdVar = abaeVar.g;
            java.lang.Object obj5 = abaeVar.a;
            aooc.af(obj2);
            obj = obj5;
            abaeVar.a = obj;
            abaeVar.g = aazdVar;
            abaeVar.b = abavVarL;
            abaeVar.h = aazdVar;
            abaeVar.c = objL;
            abaeVar.i = ahzhVarB;
            abaeVar.f = 2;
            if (a(abaeVar) != aoluVar) {
                r8 = obj;
                r7 = abavVarL;
                aazdVar3 = aazdVar;
                aosp aospVar2 = this.h;
                defpackage.abaf abafVar2 = new defpackage.abaf(aazdVar3, this, r7, r8, null);
                abaeVar.a = null;
                abaeVar.g = null;
                abaeVar.b = null;
                abaeVar.h = null;
                abaeVar.c = null;
                abaeVar.i = null;
                abaeVar.f = 3;
                objAj = aoov.aj(aospVar2, abafVar2, abaeVar);
                if (objAj != aoluVar) {
                    return objAj;
                }
            }
            return aoluVar;
        } catch (abbe e2) {
            th = e2;
            aazdVar2 = aazdVar;
            ahzhVar = ahzhVarB;
            r0 = objL;
            if (r0 != 0) {
                throw th;
            }
            r0.b(aazdVar2, ((abbe) th).c, ((abbe) th).d, ahzhVar.a(java.util.concurrent.TimeUnit.MILLISECONDS), ((abbe) th).e, ((abbe) th).a, ((abbe) th).b);
            throw th;
        }
        ahzp ahzpVar = ahzp.a;
        ahzh.b(ahzpVar);
        acxg acxgVar = this.f;
        abavVarL = acxgVar.l(aazdVar);
        objL = acxgVar.l(aazdVar);
        ahzhVarB = ahzh.b(ahzpVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: abbe */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) throws abbe {
        defpackage.abah abahVar;
        alez alezVar;
        java.lang.String str;
        aley aleyVar;
        if (aolnVar instanceof defpackage.abah) {
            abahVar = (defpackage.abah) aolnVar;
            int i = abahVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                abahVar.c = i - Integer.MIN_VALUE;
            } else {
                abahVar = new defpackage.abah(this, aolnVar);
            }
        } else {
            abahVar = new defpackage.abah(this, aolnVar);
        }
        java.lang.Object obj = abahVar.a;
        defpackage.abay abayVar = aolu.a;
        int i2 = abahVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (this.c != null) {
                return aojh.a;
            }
            alez alezVar2 = alez.b;
            aley aleyVar2 = aley.b;
            abahVar.d = alezVar2;
            abahVar.e = aleyVar2;
            abahVar.f = "Classification attempted before initialize called.";
            abahVar.c = 1;
            defpackage.abay abayVar2 = defpackage.abay.a;
            if (abayVar2 == abayVar) {
                return abayVar;
            }
            alezVar = alezVar2;
            str = "Classification attempted before initialize called.";
            aleyVar = aleyVar2;
            obj = abayVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = abahVar.f;
            aley aleyVar3 = abahVar.e;
            alez alezVar3 = abahVar.d;
            aooc.af(obj);
            str = str2;
            aleyVar = aleyVar3;
            alezVar = alezVar3;
        }
        throw new abbe(alezVar, aleyVar, str, (java.lang.Throwable) null, (akzc) null, 0L, (defpackage.abay) obj, 56);
    }
}
