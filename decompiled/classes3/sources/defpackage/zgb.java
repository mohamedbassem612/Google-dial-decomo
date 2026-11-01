package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zgb extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgb(java.util.Map map, defpackage.aeac aeacVar, adag adagVar, aduw aduwVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.f = map;
        this.e = aeacVar;
        this.d = adagVar;
        this.c = aduwVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x010a  */
    /* JADX WARN: Code duplicated, block: B:48:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x0135  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:73:0x0197  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Type inference failed for: r12v46, types: [abxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [aeac, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2;
        defpackage.abxt abxtVar;
        defpackage.ser serVar;
        android.accounts.Account account;
        java.lang.Object obj3;
        snl snlVar;
        int iW;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        defpackage.ryf ryfVar;
        ?? r12;
        defpackage.abxp abxpVarE;
        defpackage.abxs abxsVarG;
        java.lang.Object obj8;
        java.lang.Object obj9;
        int i = this.$cid;
        java.lang.String str = null;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    aooc.af(obj);
                } else {
                    obj2 = this.a;
                    aooc.af(obj);
                }
                return defpackage.zfm.e;
            }
            aooc.af(obj);
            defpackage.zfw zfwVar = ((defpackage.zfy) this.c).d;
            if (zfwVar == null) {
                zfwVar = defpackage.zfw.a;
            }
            java.lang.String str2 = zfwVar.b;
            aooh.e(str2, "getMessageId(...)");
            java.lang.Object obj10 = this.d;
            defpackage.xhb xhbVar = new defpackage.xhb((defpackage.abtr) this.e, (aonj) this.f, str2, (aoln) null, 4);
            this.a = str2;
            this.b = 1;
            j$.time.Duration duration = (j$.time.Duration) obj10;
            obj = aooh.N(aorh.j(aooh.B(duration.getSeconds(), aorj.d), aooh.A(duration.getNano(), aorj.a)), xhbVar, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj2 = str2;
            defpackage.zfm zfmVar = (defpackage.zfm) obj;
            if (zfmVar != null) {
                return zfmVar;
            }
            java.lang.Object obj11 = this.e;
            this.a = null;
            this.b = 2;
            if (((defpackage.abtr) obj11).i((java.lang.String) obj2, this) == aoluVar) {
                return aoluVar;
            }
            return defpackage.zfm.e;
        }
        if (i != 1) {
            aolu aoluVar2 = aolu.a;
            if (this.b != 0) {
                obj9 = this.a;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.HashMap map = new java.util.HashMap();
                for (java.util.Map.Entry entry : this.f.entrySet()) {
                    aduy aduyVarA = (aduy) entry.getValue();
                    int iA = this.e.a(aduyVarA);
                    if (aduyVarA.f != iA) {
                        adux aduxVar = new adux(aduyVarA);
                        aduxVar.i(iA);
                        aduyVarA = aduxVar.a();
                        arrayList.add(aduyVarA);
                    }
                    map.put(entry.getKey(), aduyVarA);
                }
                aeee aeeeVarX = ((aogc) ((adag) this.d).b).X((aduw) this.c);
                this.a = map;
                this.b = 1;
                obj = aeeeVarX.e(arrayList, this);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
                obj9 = map;
            }
            adtz adtzVar = (adtz) obj;
            return !(adtzVar instanceof adtv) ? new adub(obj9) : adtzVar;
        }
        aolu aoluVar3 = aolu.a;
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 == 1) {
                aooc.af(obj);
            } else if (i3 == 2) {
                abxtVar = (defpackage.abxt) this.a;
                aooc.af(obj);
                serVar = (defpackage.ser) obj;
                if (serVar != null) {
                    account = serVar.a;
                } else {
                    account = null;
                }
                obj3 = this.f;
                if (account != null) {
                    throw new java.lang.IllegalStateException("Account not found for ".concat(java.lang.String.valueOf(obj3)));
                }
                java.lang.Object obj12 = this.c;
                this.a = null;
                this.b = 3;
                obj = ((defpackage.ryf) obj12).b.h(abxtVar, account, this);
                if (obj == aoluVar3) {
                    return aoluVar3;
                }
                snlVar = (snl) obj;
                iW = anty.W(snlVar);
                if (iW != 0) {
                    if (iW != 1) {
                        throw new aois();
                    }
                    throw ((defpackage.rzj) snlVar).a;
                }
                obj4 = this.c;
                obj5 = this.f;
                this.a = snlVar;
                this.b = 4;
                if (((defpackage.ryf) obj4).c.h((java.lang.String) obj5, this) == aoluVar3) {
                    return aoluVar3;
                }
                obj6 = this.c;
                obj7 = this.e;
                this.a = snlVar;
                this.b = 5;
                if (((defpackage.ryf) obj6).c.i((defpackage.sfb) obj7, this) == aoluVar3) {
                    return aoluVar3;
                }
                obj8 = this.c;
                this.a = snlVar;
                this.b = 6;
                if (((defpackage.ryf) obj8).a.b(this) == aoluVar3) {
                    return aoluVar3;
                }
            } else if (i3 == 3) {
                aooc.af(obj);
                snlVar = (snl) obj;
                iW = anty.W(snlVar);
                if (iW != 0) {
                    if (iW != 1) {
                        throw new aois();
                    }
                    throw ((defpackage.rzj) snlVar).a;
                }
                obj4 = this.c;
                obj5 = this.f;
                this.a = snlVar;
                this.b = 4;
                if (((defpackage.ryf) obj4).c.h((java.lang.String) obj5, this) == aoluVar3) {
                    return aoluVar3;
                }
                obj6 = this.c;
                obj7 = this.e;
                this.a = snlVar;
                this.b = 5;
                if (((defpackage.ryf) obj6).c.i((defpackage.sfb) obj7, this) == aoluVar3) {
                    return aoluVar3;
                }
                obj8 = this.c;
                this.a = snlVar;
                this.b = 6;
                if (((defpackage.ryf) obj8).a.b(this) == aoluVar3) {
                    return aoluVar3;
                }
            } else if (i3 != 4) {
                snlVar = (snl) this.a;
                aooc.af(obj);
                if (i3 == 5) {
                    obj8 = this.c;
                    this.a = snlVar;
                    this.b = 6;
                    if (((defpackage.ryf) obj8).a.b(this) == aoluVar3) {
                        return aoluVar3;
                    }
                }
            } else {
                snlVar = (snl) this.a;
                aooc.af(obj);
                obj6 = this.c;
                obj7 = this.e;
                this.a = snlVar;
                this.b = 5;
                if (((defpackage.ryf) obj6).c.i((defpackage.sfb) obj7, this) == aoluVar3) {
                    return aoluVar3;
                }
                obj8 = this.c;
                this.a = snlVar;
                this.b = 6;
                if (((defpackage.ryf) obj8).a.b(this) == aoluVar3) {
                    return aoluVar3;
                }
            }
            ryfVar = (defpackage.ryf) this.c;
            if (((java.lang.Boolean) ryfVar.f.a()).booleanValue()) {
                r12 = ((defpackage.rzm) snlVar).a;
                if (r12 != 0 && (abxpVarE = defpackage.abxl.e(r12)) != null && (abxsVarG = defpackage.abxl.g(abxpVarE)) != null) {
                    str = abxsVarG.f;
                }
                if (str != null) {
                    android.content.Context context = ryfVar.d;
                    android.net.Uri uri = android.net.Uri.parse(str);
                    aooh.e(uri, "parse(...)");
                    context.grantUriPermission("com.google.android.contacts", uri, 1);
                }
            }
            return ((defpackage.rzm) snlVar).a;
        }
        aooc.af(obj);
        java.lang.Object obj13 = this.c;
        java.lang.Object obj14 = this.d;
        defpackage.ryf ryfVar2 = (defpackage.ryf) obj13;
        android.content.Context context2 = ryfVar2.d;
        int i4 = context2.getResources().getDisplayMetrics().widthPixels;
        int i5 = context2.getResources().getDisplayMetrics().heightPixels;
        this.b = 1;
        obj = ryfVar2.a.f((defpackage.abxt) obj14, i4, i5, this);
        if (obj == aoluVar3) {
            return aoluVar3;
        }
        defpackage.abxt abxtVar2 = (defpackage.abxt) obj;
        if (abxtVar2 == null) {
            throw new java.lang.IllegalStateException("My Calling Card crop failed");
        }
        java.lang.Object obj15 = this.c;
        java.lang.Object obj16 = this.f;
        this.a = abxtVar2;
        this.b = 2;
        java.lang.Object objB = ((defpackage.ryf) obj15).c.b((java.lang.String) obj16, this);
        if (objB == aoluVar3) {
            return aoluVar3;
        }
        abxtVar = abxtVar2;
        obj = objB;
        serVar = (defpackage.ser) obj;
        if (serVar != null) {
            account = serVar.a;
        } else {
            account = null;
        }
        obj3 = this.f;
        if (account != null) {
            throw new java.lang.IllegalStateException("Account not found for ".concat(java.lang.String.valueOf(obj3)));
        }
        java.lang.Object obj17 = this.c;
        this.a = null;
        this.b = 3;
        obj = ((defpackage.ryf) obj17).b.h(abxtVar, account, this);
        if (obj == aoluVar3) {
            return aoluVar3;
        }
        snlVar = (snl) obj;
        iW = anty.W(snlVar);
        if (iW != 0) {
            if (iW != 1) {
                throw new aois();
            }
            throw ((defpackage.rzj) snlVar).a;
        }
        obj4 = this.c;
        obj5 = this.f;
        this.a = snlVar;
        this.b = 4;
        if (((defpackage.ryf) obj4).c.h((java.lang.String) obj5, this) == aoluVar3) {
            return aoluVar3;
        }
        obj6 = this.c;
        obj7 = this.e;
        this.a = snlVar;
        this.b = 5;
        if (((defpackage.ryf) obj6).c.i((defpackage.sfb) obj7, this) == aoluVar3) {
            return aoluVar3;
        }
        obj8 = this.c;
        this.a = snlVar;
        this.b = 6;
        if (((defpackage.ryf) obj8).a.b(this) == aoluVar3) {
            return aoluVar3;
        }
        ryfVar = (defpackage.ryf) this.c;
        if (((java.lang.Boolean) ryfVar.f.a()).booleanValue()) {
            r12 = ((defpackage.rzm) snlVar).a;
            if (r12 != 0) {
                str = abxsVarG.f;
            }
            if (str != null) {
                android.content.Context context3 = ryfVar.d;
                android.net.Uri uri2 = android.net.Uri.parse(str);
                aooh.e(uri2, "parse(...)");
                context3.grantUriPermission("com.google.android.contacts", uri2, 1);
            }
        }
        return ((defpackage.rzm) snlVar).a;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aeac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aonj, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.d;
            return new defpackage.zgb((defpackage.zfy) obj2, (j$.time.Duration) obj3, (defpackage.abtr) this.e, (aonj) this.f, aolnVar, 0);
        }
        if (i != 1) {
            return new defpackage.zgb((java.util.Map) this.f, (defpackage.aeac) this.e, (adag) this.d, (aduw) this.c, aolnVar, 2);
        }
        java.lang.Object obj4 = this.c;
        java.lang.Object obj5 = this.d;
        return new defpackage.zgb((defpackage.ryf) obj4, (defpackage.abxt) obj5, (java.lang.String) this.f, (defpackage.sfb) this.e, aolnVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgb(defpackage.ryf ryfVar, defpackage.abxt abxtVar, java.lang.String str, defpackage.sfb sfbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ryfVar;
        this.d = abxtVar;
        this.f = str;
        this.e = sfbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zgb(defpackage.zfy zfyVar, j$.time.Duration duration, defpackage.abtr abtrVar, aonj aonjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = zfyVar;
        this.d = duration;
        this.e = abtrVar;
        this.f = aonjVar;
    }
}
