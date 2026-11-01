package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class allm implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ allm(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.alsy alsyVar;
        switch (this.$cid) {
            case 0:
                return (aigf) j$.util.Collection.-EL.stream(((alln) this.a).d((java.lang.String) this.b).f).collect(aido.b(new defpackage.alki(13), new defpackage.alki(14)));
            case 1:
                return defpackage.alkt.d(((java.lang.Integer) obj).intValue(), this.a, this.b);
            case 2:
                aify aifyVarB = ((alln) ((defpackage.apjb) this.a).b).b((java.lang.String) this.b);
                ahvr.ci(aifyVarB);
                return new defpackage.aihy(aifyVarB);
            case 3:
                java.lang.String str = (java.lang.String) obj;
                if (str.isEmpty()) {
                    return j$.util.Optional.empty();
                }
                defpackage.alxu alxuVar = (defpackage.alxu) this.a;
                defpackage.alxr alxrVar = alxuVar.e;
                if (alxrVar == null) {
                    alxrVar = defpackage.alxr.a;
                }
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.alxf) j$.util.DesugarCollections.unmodifiableMap(alxrVar.h).get(str));
                if (optionalOfNullable.isPresent()) {
                    return optionalOfNullable;
                }
                akzx akzxVarM = defpackage.alxf.a.m();
                akzxVarM.u();
                defpackage.alxf alxfVar = (defpackage.alxf) akzxVarM.b;
                alxfVar.g = 3;
                alxfVar.b |= 4;
                defpackage.alxr alxrVar2 = alxuVar.e;
                if (alxrVar2 == null) {
                    alxrVar2 = defpackage.alxr.a;
                }
                java.lang.Object obj2 = this.b;
                java.lang.String str2 = alxrVar2.f;
                if (str2.isEmpty() || !str.contains(str2)) {
                    defpackage.alsy alsyVar2 = defpackage.alsy.NO_ACTION;
                    akzxVarM.u();
                    defpackage.alxf alxfVar2 = (defpackage.alxf) akzxVarM.b;
                    alxfVar2.f = alsyVar2.j;
                    alxfVar2.b |= 2;
                    return ((defpackage.alzd) obj2).o(akzxVarM, str, alxuVar);
                }
                defpackage.alxr alxrVar3 = alxuVar.e;
                if (alxrVar3 == null) {
                    alxrVar3 = defpackage.alxr.a;
                }
                java.util.Map mapUnmodifiableMap = j$.util.DesugarCollections.unmodifiableMap(new defpackage.alas(alxrVar3.g, defpackage.alxr.i));
                java.util.List listJ = ahzf.d(str2).j(str);
                if (listJ.size() == 2 && mapUnmodifiableMap.containsKey(listJ.get(1))) {
                    alsyVar = (defpackage.alsy) mapUnmodifiableMap.get(listJ.get(1));
                } else {
                    defpackage.alzd.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/smartreply/SmartReplyLlmExtractionProcessor", "getCallAction", 692, "SmartReplyLlmExtractionProcessor.java").y("Invalid or missing call action: %s. Setting NO_ACTION as default.", listJ.size() > 1 ? listJ.get(1) : "N/A");
                    alsyVar = defpackage.alsy.NO_ACTION;
                }
                akzxVarM.u();
                defpackage.alxf alxfVar3 = (defpackage.alxf) akzxVarM.b;
                alxfVar3.f = alsyVar.j;
                alxfVar3.b |= 2;
                return ((defpackage.alzd) obj2).o(akzxVarM, (java.lang.String) ahzf.d(str2).j(str).get(0), alxuVar);
            case 4:
                return defpackage.ambu.c((java.lang.String) this.b, (defpackage.amcb) this.a, defpackage.ambs.a((aify) obj));
            case 5:
                j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((aify) ((java.util.Map.Entry) obj).getValue());
                java.lang.Object obj3 = this.b;
                return (aify) stream.filter(new defpackage.amcc(obj3, 8)).map(new defpackage.allm(obj3, this.a, 6, null)).collect(aido.a);
            case 6:
                java.lang.Integer num = (java.lang.Integer) obj;
                int iIntValue = num.intValue() - ((defpackage.altp) this.b).a;
                int iIntValue2 = num.intValue();
                ?? r11 = this.a;
                return java.lang.Integer.valueOf(iIntValue + ((java.lang.Integer) ahvr.bi((java.lang.Iterable) r11, iIntValue2, (java.lang.Integer) ahvr.bk((java.lang.Iterable) r11))).intValue());
            case 7:
                defpackage.alig aligVar = (defpackage.alig) ((java.util.Map.Entry) obj).getValue();
                java.lang.Object obj4 = this.b;
                java.lang.String str3 = ((defpackage.amcp) this.a).b;
                aify aifyVarB2 = defpackage.amev.b((java.lang.String) obj4, str3);
                int i = defpackage.altp.c;
                alto altoVar = new alto();
                alif alifVar = aligVar.b;
                int i2 = alifVar.a;
                altoVar.c(i2 + ((java.lang.Integer) aifyVarB2.get(i2)).intValue());
                int i3 = alifVar.b;
                altoVar.b(i3 + ((java.lang.Integer) aifyVarB2.get(i3 - 1)).intValue());
                defpackage.altp altpVarF = altoVar.a().f(str3);
                return new defpackage.alig(altpVarF.h(str3).trim(), new alif(altpVarF.a, altpVarF.b, alifVar.c));
            default:
                aimz aimzVar = defpackage.amev.a;
                return (java.lang.Integer) ((aify) this.a).get(((java.lang.Integer) ((aigf) this.b).get((java.lang.Integer) obj)).intValue());
        }
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }

    public /* synthetic */ allm(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
