package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nuw extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.nux e;
    final /* synthetic */ defpackage.nvg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuw(defpackage.nux nuxVar, defpackage.nvg nvgVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = nuxVar;
        this.f = nvgVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ae  */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        defpackage.nux nuxVar;
        defpackage.nvg nvgVar;
        apdp apdpVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Throwable th;
        java.lang.Object obj4;
        java.lang.Object next;
        java.lang.String str;
        java.lang.Object obj5;
        java.lang.Object obj6;
        aolu aoluVar = aolu.a;
        int i = this.d;
        try {
            if (i == 0) {
                aooc.af(obj);
                nuxVar = this.e;
                nvgVar = this.f;
                apdpVar = nuxVar.e;
                this.a = apdpVar;
                this.b = nvgVar;
                this.c = nuxVar;
                this.d = 1;
                if (apdpVar.b(this) == aoluVar) {
                    obj3 = apdpVar;
                    obj2 = nuxVar;
                    return aoluVar;
                }
            } else {
                if (i != 1) {
                    defpackage.nux nuxVar2 = (defpackage.nux) this.b;
                    obj4 = this.a;
                    try {
                        aooc.af(obj);
                        obj5 = nuxVar2;
                        obj4 = obj4;
                        ((defpackage.nux) obj5).d = true;
                        obj6 = obj4;
                        ((apdp) obj6).d();
                        return aojh.a;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((apdp) obj4).d();
                        throw th;
                    }
                }
                java.lang.Object obj7 = this.c;
                nvgVar = (defpackage.nvg) this.b;
                java.lang.Object obj8 = this.a;
                aooc.af(obj);
                obj2 = obj7;
                obj3 = obj8;
            }
            obj3 = apdpVar;
            obj2 = nuxVar;
            if (nvgVar.b != 2) {
                throw new java.lang.IllegalArgumentException("The provided event is not a NewConversationStateReceived event.");
            }
            if (((defpackage.nux) obj2).d) {
                aojh aojhVar = aojh.a;
                ((apdp) obj3).d();
                return aojhVar;
            }
            alwy alwyVar = ((defpackage.nvf) nvgVar.c).c;
            if (alwyVar == null) {
                alwyVar = alwy.a;
            }
            alat alatVar = alwyVar.c;
            aooh.e(alatVar, "getConversationItemsList(...)");
            java.util.Iterator it = alatVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                alww alwwVar = (alww) next;
                int i2 = alwwVar.c;
                if (alwv.a(i2) == alwv.a) {
                    int iAQ = a.aQ((i2 == 3 ? (alyp) alwwVar.d : alyp.a).c);
                    if (iAQ != 0 && iAQ == 2) {
                        break;
                    }
                }
            }
            alww alwwVar2 = (alww) next;
            if (alwwVar2 == null) {
                str = null;
            } else {
                alyp alypVar = alwwVar2.c == 3 ? (alyp) alwwVar2.d : alyp.a;
                if (alypVar == null) {
                    str = null;
                } else {
                    alwf alwfVar = alypVar.d;
                    if (alwfVar == null) {
                        alwfVar = alwf.a;
                    }
                    if (alwfVar != null) {
                        str = alwfVar.c;
                    } else {
                        str = null;
                    }
                }
            }
            defpackage.nux.a.b().l("com/android/dialer/dobby/impl/wear/bam/synctowear/BamConversationStateSyncEventListener", "onBamSyncEvent$<anonymous>$<anonymous>$<anonymous>", 55, "BamConversationStateSyncEventListener.kt").y("firstBotTranscript is present: %b", java.lang.Boolean.valueOf(str != null));
            obj6 = obj3;
            if (str != null) {
                defpackage.nuz nuzVar = ((defpackage.nux) obj2).b;
                zoe zoeVarCm = aehj.cm(zkq.a.m());
                akzx akzxVarM = zkn.a.m();
                aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                zkn zknVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                zknVar.b |= 1;
                zknVar.c = str;
                zkn zknVarP = akzxVarM.p();
                aooh.e(zknVarP, "build(...)");
                zkn zknVar2 = zknVarP;
                aooh.f(zknVar2, "value");
                java.lang.Object obj9 = zoeVarCm.a;
                ((akzx) obj9).u();
                zkq zkqVar = ((akzx) obj9).b;
                j$.util.Objects.requireNonNull(zknVar2);
                zkqVar.c = zknVar2;
                zkqVar.b = 2;
                zkq zkqVarG = zoeVarCm.g();
                this.a = obj3;
                this.b = obj2;
                this.c = null;
                this.d = 2;
                java.lang.Object objA = nuzVar.a(zkqVarG, this);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                obj5 = obj2;
                obj = objA;
                obj4 = obj3;
                ((defpackage.nux) obj5).d = true;
                obj6 = obj4;
            }
            ((apdp) obj6).d();
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            th = th3;
            obj4 = obj3;
            ((apdp) obj4).d();
            throw th;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nuw(this.e, this.f, aolnVar);
    }
}
