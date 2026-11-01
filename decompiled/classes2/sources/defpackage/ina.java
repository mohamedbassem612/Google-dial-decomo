package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ina extends aomh implements aonn {
    int a;
    int b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.inc e;
    final /* synthetic */ ifv f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ina(defpackage.inc incVar, ifv ifvVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = incVar;
        this.f = ifvVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[LOOP:0: B:44:0x00c4->B:56:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final java.lang.Object b(java.lang.Object obj) {
        int i;
        int i2;
        java.lang.Object obj2;
        defpackage.imb imbVarA;
        java.lang.Object obj3;
        java.lang.Object obj4;
        defpackage.inc incVar;
        ifv ifvVar;
        defpackage.igd igdVar;
        defpackage.inc incVar2;
        java.util.Map map;
        defpackage.iml imlVar;
        java.util.Iterator it;
        aolu aoluVar = aolu.a;
        int i3 = this.d;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = this.b;
                i = this.a;
                java.lang.Object obj5 = this.c;
                aooc.af(obj);
                obj2 = obj5;
            } else if (i3 == 2) {
                i2 = this.a;
                java.lang.Object obj6 = this.c;
                aooc.af(obj);
                obj3 = obj6;
                if (i2 != 0) {
                    incVar = this.e;
                    ifvVar = this.f;
                    igdVar = defpackage.igd.AUDIO_SOURCE_UPLINK;
                    this.c = obj3;
                    this.d = 3;
                    if (incVar.k(ifvVar, (defpackage.imb) obj3, igdVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj4 = obj3;
                incVar2 = this.e;
                ifv ifvVar2 = this.f;
                map = incVar2.h;
                map.put(ifvVar2, obj4);
                if (map.isEmpty()) {
                    imlVar = incVar2.d;
                    this.c = null;
                    this.d = 4;
                    if (imlVar.a(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!(((defpackage.imb) ((java.util.Map.Entry) it.next()).getValue()).b instanceof defpackage.inf)) {
                        }
                    }
                    imlVar = incVar2.d;
                    this.c = null;
                    this.d = 4;
                    if (imlVar.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else if (i3 != 3) {
                aooc.af(obj);
            } else {
                java.lang.Object obj7 = this.c;
                aooc.af(obj);
                obj4 = obj7;
                incVar2 = this.e;
                ifv ifvVar3 = this.f;
                map = incVar2.h;
                map.put(ifvVar3, obj4);
                if (map.isEmpty()) {
                    it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!(((defpackage.imb) ((java.util.Map.Entry) it.next()).getValue()).b instanceof defpackage.inf)) {
                        }
                    }
                    imlVar = incVar2.d;
                    this.c = null;
                    this.d = 4;
                    if (imlVar.a(this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    imlVar = incVar2.d;
                    this.c = null;
                    this.d = 4;
                    if (imlVar.a(this) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.inc incVar3 = this.e;
        ifv ifvVar4 = this.f;
        defpackage.imb imbVar = (defpackage.imb) incVar3.h.get(ifvVar4);
        if (imbVar == null || (imbVar.b instanceof defpackage.inf)) {
            defpackage.inc.a.b().l("com/android/dialer/audioprism/internal/models/soda/impl/AudioPrismSodaModelRunner", "stop$<anonymous>", 153, "AudioPrismSodaModelRunner.kt").y("skip: not stopping since feature %s is not running", ifvVar4.name());
            return aojh.a;
        }
        ify ifyVar = imbVar.a.c;
        if (ifyVar == null) {
            ifyVar = ify.a;
        }
        ifx ifxVarB = ifx.b(ifyVar.b);
        if (ifxVarB == null) {
            ifxVarB = ifx.d;
        }
        int i4 = (ifxVarB == ifx.b || ifxVarB == ifx.c) ? 1 : 0;
        int i5 = ifxVarB == ifx.c ? 1 : 0;
        defpackage.ima imaVar = incVar3.e;
        this.c = imbVar;
        this.a = i4;
        this.b = i5;
        this.d = 1;
        obj = imaVar.g(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        i = i4;
        i2 = i5;
        obj2 = imbVar;
        imbVarA = ((defpackage.imb) obj2).a((java.lang.Long) obj);
        obj3 = imbVarA;
        if (i != 0) {
            defpackage.inc incVar4 = this.e;
            ifv ifvVar5 = this.f;
            defpackage.igd igdVar2 = defpackage.igd.AUDIO_SOURCE_DOWNLINK;
            this.c = imbVarA;
            this.a = i2;
            this.d = 2;
            if (incVar4.k(ifvVar5, imbVarA, igdVar2, this) == aoluVar) {
                obj3 = imbVarA;
                return aoluVar;
            }
        }
        if (i2 != 0) {
            incVar = this.e;
            ifvVar = this.f;
            igdVar = defpackage.igd.AUDIO_SOURCE_UPLINK;
            this.c = obj3;
            this.d = 3;
            if (incVar.k(ifvVar, (defpackage.imb) obj3, igdVar, this) == aoluVar) {
                return aoluVar;
            }
        }
        obj4 = obj3;
        incVar2 = this.e;
        ifv ifvVar6 = this.f;
        map = incVar2.h;
        map.put(ifvVar6, obj4);
        if (map.isEmpty()) {
            it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (!(((defpackage.imb) ((java.util.Map.Entry) it.next()).getValue()).b instanceof defpackage.inf)) {
                }
            }
            imlVar = incVar2.d;
            this.c = null;
            this.d = 4;
            if (imlVar.a(this) == aoluVar) {
                return aoluVar;
            }
        } else {
            imlVar = incVar2.d;
            this.c = null;
            this.d = 4;
            if (imlVar.a(this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ina(this.e, this.f, aolnVar);
    }
}
