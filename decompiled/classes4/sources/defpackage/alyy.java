package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alyy implements java.util.function.Function {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ alyy(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
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
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x02c5  */
    /* JADX WARN: Type inference failed for: r13v139, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v77, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.alyh alyhVar;
        java.lang.String strQ;
        double dSqrt;
        int i = 2;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                defpackage.alza alzaVar = (defpackage.alza) this.a;
                return ahus.x((alzaVar.a && alzaVar.e.containsKey(str)) ? j$.util.Optional.ofNullable((defpackage.alxf) alzaVar.e.get(str)) : j$.util.Optional.ofNullable((defpackage.alxf) alzaVar.d.get(str)));
            case 1:
                defpackage.aluk alukVar = (defpackage.aluk) this.a;
                defpackage.alxf alxfVar = (defpackage.alxf) obj;
                long andIncrement = alukVar.a.getAndIncrement();
                alukVar.u.put(java.lang.Long.valueOf(andIncrement), alxfVar);
                akzx akzxVarM = defpackage.alyi.a.m();
                akzxVarM.u();
                defpackage.alyi alyiVar = (defpackage.alyi) akzxVarM.b;
                alyiVar.b |= 1;
                alyiVar.c = andIncrement;
                java.lang.String str2 = alxfVar.e;
                akzxVarM.u();
                defpackage.alyi alyiVar2 = (defpackage.alyi) akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                alyiVar2.b |= 2;
                alyiVar2.d = str2;
                akzxVarM.u();
                defpackage.alyi alyiVar3 = (defpackage.alyi) akzxVarM.b;
                alyiVar3.e = 2;
                alyiVar3.b |= 4;
                defpackage.alsy alsyVarB = defpackage.alsy.b(alxfVar.f);
                if (alsyVarB == null) {
                    alsyVarB = defpackage.alsy.NO_ACTION;
                }
                switch (alsyVarB) {
                    case NO_ACTION:
                    case START_RINGING:
                    case ANSWER_CALL:
                    case END_MISSED_CALL:
                        alyhVar = defpackage.alyh.ACTION_UNKNOWN;
                        break;
                    case END_CALL:
                    case START_TAKING_MESSAGE:
                        alyhVar = defpackage.alyh.ACTION_END_CALL;
                        break;
                    case END_SPAM_CALL:
                        alyhVar = defpackage.alyh.ACTION_REPORT_SPAM;
                        break;
                    case ASK_FOR_CONSENT_FOR_AI_REPLIES:
                        alyhVar = defpackage.alyh.ACTION_ASK_FOR_CONSENT_FOR_AI_REPLIES;
                        break;
                    case PLAY_DTMF_TONE:
                        alyhVar = defpackage.alyh.ACTION_PLAY_DTMF_TONE;
                        break;
                    default:
                        throw new java.lang.RuntimeException(null, null);
                }
                akzxVarM.u();
                defpackage.alyi alyiVar4 = (defpackage.alyi) akzxVarM.b;
                alyiVar4.f = alyhVar.f;
                alyiVar4.b |= 8;
                int i2 = alxfVar.c;
                if (i2 == 4) {
                    java.lang.String str3 = i2 == 4 ? (java.lang.String) alxfVar.d : "";
                    akzxVarM.u();
                    defpackage.alyi alyiVar5 = (defpackage.alyi) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str3);
                    alyiVar5.b |= 16;
                    alyiVar5.g = str3;
                }
                if ((alxfVar.b & 4) != 0) {
                    int iR = airh.r(alxfVar.g);
                    int i3 = iR != 0 ? iR : 1;
                    akzxVarM.u();
                    defpackage.alyi alyiVar6 = (defpackage.alyi) akzxVarM.b;
                    alyiVar6.h = i3 - 1;
                    alyiVar6.b |= 32;
                }
                return (defpackage.alyi) akzxVarM.p();
            case 2:
                int i4 = defpackage.alza.h;
                return this.a;
            case 3:
                return ((defpackage.alza) this.a).c(((defpackage.alxm) obj).c);
            case 4:
                return ((defpackage.alza) this.a).c(((defpackage.alxc) obj).c);
            case 5:
                ahxn ahxnVar = ahxm.b;
                java.lang.String strNormalize = java.text.Normalizer.normalize(((defpackage.alxf) obj).e, java.text.Normalizer.Form.NFKC);
                int length = strNormalize.length();
                int i5 = length - 1;
                int i6 = 0;
                while (i6 < length && ahxnVar.c(strNormalize.charAt(i6))) {
                    i6++;
                }
                int i7 = i5;
                while (i7 > i6 && ahxnVar.c(strNormalize.charAt(i7))) {
                    i7--;
                }
                if (i6 == 0 && i7 == i5) {
                    int length2 = strNormalize.length();
                    int i8 = 0;
                    while (i8 < length2) {
                        char cCharAt = strNormalize.charAt(i8);
                        if (ahxnVar.c(cCharAt)) {
                            int i9 = i8 + 1;
                            if (cCharAt != ' ' || (i8 != length2 - 1 && ahxnVar.c(strNormalize.charAt(i9)))) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
                                sb.append((java.lang.CharSequence) strNormalize, 0, i8);
                                sb.append(' ');
                                strQ = ahxnVar.q(strNormalize, i9, length2, sb, true);
                            } else {
                                i8 = i9;
                            }
                        }
                        i8++;
                    }
                    strQ = strNormalize.toString();
                } else {
                    int i10 = i7 + 1;
                    strQ = ahxnVar.q(strNormalize, i6, i10, new java.lang.StringBuilder(i10 - i6), false);
                }
                defpackage.alza alzaVar2 = (defpackage.alza) this.a;
                java.lang.String strReplaceAll = strQ.toLowerCase(alzaVar2.f).replaceAll("\\p{Punct}", "");
                return (java.lang.String) alzaVar2.g.getOrDefault(strReplaceAll, strReplaceAll);
            case 6:
                defpackage.almm almmVar = (defpackage.almm) obj;
                akzx akzxVarM2 = defpackage.alxf.a.m();
                defpackage.alza alzaVar3 = (defpackage.alza) this.a;
                java.lang.String strE = alzaVar3.c.e(almmVar.c);
                akzxVarM2.u();
                defpackage.alxf alxfVar2 = (defpackage.alxf) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strE);
                alxfVar2.b |= 1;
                alxfVar2.e = strE;
                defpackage.alsy alsyVarC = alzaVar3.c.c(almmVar.c);
                akzxVarM2.u();
                defpackage.alxf alxfVar3 = (defpackage.alxf) akzxVarM2.b;
                alxfVar3.f = alsyVarC.j;
                alxfVar3.b |= 2;
                java.lang.String str4 = almmVar.c;
                akzxVarM2.u();
                defpackage.alxf alxfVar4 = (defpackage.alxf) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str4);
                alxfVar4.c = 4;
                alxfVar4.d = str4;
                if (almmVar.f) {
                    akzxVarM2.u();
                    defpackage.alxf alxfVar5 = (defpackage.alxf) akzxVarM2.b;
                    alxfVar5.g = 2;
                    alxfVar5.b |= 4;
                }
                return (defpackage.alxf) akzxVarM2.p();
            case 7:
                java.lang.String str5 = (java.lang.String) obj;
                defpackage.amgz amgzVarD = ((defpackage.alzj) this.a).a.d(str5);
                akzx akzxVarM3 = defpackage.alsj.a.m();
                akzxVarM3.u();
                defpackage.alsj alsjVar = (defpackage.alsj) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str5);
                alsjVar.b |= 1;
                alsjVar.c = str5;
                java.lang.String str6 = amgzVarD.l;
                akzxVarM3.u();
                defpackage.alsj alsjVar2 = (defpackage.alsj) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str6);
                alsjVar2.b |= 2;
                alsjVar2.d = str6;
                defpackage.alsy alsyVarB2 = defpackage.alsy.b(amgzVarD.n);
                if (alsyVarB2 == null) {
                    alsyVarB2 = defpackage.alsy.NO_ACTION;
                }
                int iOrdinal = alsyVarB2.ordinal();
                if (iOrdinal == 1) {
                    i = 4;
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 6) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                }
                akzxVarM3.u();
                defpackage.alsj alsjVar3 = (defpackage.alsj) akzxVarM3.b;
                alsjVar3.e = i - 1;
                alsjVar3.b |= 4;
                return (defpackage.alsj) akzxVarM3.p();
            case 8:
                defpackage.almx almxVar = (defpackage.almx) obj;
                aigf aigfVar = ((defpackage.alzk) this.a).d;
                defpackage.alov alovVar = almxVar.c;
                if (alovVar == null) {
                    alovVar = defpackage.alov.a;
                }
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.alor) aigfVar.get(alovVar.b));
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.alor) optionalOfNullable.get()).p());
                }
                akzx akzxVar = (akzx) (true != optionalOfNullable.isPresent() ? defpackage.alor.a.m() : optionalOfNullable.get());
                akzxVar.u();
                defpackage.alor alorVar = (defpackage.alor) akzxVar.b;
                defpackage.alor alorVar2 = defpackage.alor.a;
                j$.util.Objects.requireNonNull(almxVar);
                alat alatVar = alorVar.b;
                if (!alatVar.c()) {
                    alorVar.b = alad.J(alatVar);
                }
                alorVar.b.add(almxVar);
                return (defpackage.alor) akzxVar.p();
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                defpackage.alov alovVar2 = (defpackage.alov) obj;
                akzx akzxVarM4 = defpackage.almx.a.m();
                akzxVarM4.u();
                defpackage.almx almxVar2 = (defpackage.almx) akzxVarM4.b;
                j$.util.Objects.requireNonNull(alovVar2);
                almxVar2.c = alovVar2;
                almxVar2.b |= 1;
                defpackage.almd almdVar = alovVar2.c;
                if (almdVar == null) {
                    almdVar = defpackage.almd.a;
                }
                ?? r13 = this.a;
                alaj alajVar = almdVar.b;
                if (r13.size() != alajVar.size()) {
                    defpackage.alzk.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/spamfilter/SpamAudioMatchProcessor", "getDistance", 271, "SpamAudioMatchProcessor.java").z("float size mismatch %d:%d", r13.size(), alajVar.size());
                    dSqrt = 1000.0d;
                } else {
                    double dPow = 0.0d;
                    for (int i11 = 0; i11 < r13.size(); i11++) {
                        dPow += java.lang.Math.pow(((java.lang.Float) r13.get(i11)).floatValue() - ((java.lang.Float) alajVar.get(i11)).floatValue(), 2.0d);
                    }
                    dSqrt = java.lang.Math.sqrt(dPow);
                }
                akzxVarM4.u();
                defpackage.almx almxVar3 = (defpackage.almx) akzxVarM4.b;
                almxVar3.b |= 2;
                almxVar3.d = dSqrt;
                return (defpackage.almx) akzxVarM4.p();
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                java.util.Map.Entry entry = (java.util.Map.Entry) obj;
                int i12 = defpackage.alzn.c;
                defpackage.alyd alydVar = (defpackage.alyd) entry.getKey();
                defpackage.alyl alylVar = (defpackage.alyl) entry.getValue();
                j$.util.Optional optionalOfNullable2 = j$.util.Optional.ofNullable((java.lang.String) ((aigf) this.a).get(alydVar));
                defpackage.xbz xbzVar = new defpackage.xbz(alylVar, 19);
                if (true != optionalOfNullable2.isPresent()) {
                    return optionalOfNullable2;
                }
                java.lang.Object obj2 = optionalOfNullable2.get();
                java.lang.Object obj3 = xbzVar.a;
                java.lang.String str7 = (java.lang.String) obj2;
                akzx akzxVarM5 = defpackage.alym.a.m();
                akzxVarM5.u();
                defpackage.alym alymVar = (defpackage.alym) akzxVarM5.b;
                alymVar.c = ((defpackage.alyl) obj3).h;
                alymVar.b |= 1;
                akzxVarM5.u();
                defpackage.alym alymVar2 = (defpackage.alym) akzxVarM5.b;
                j$.util.Objects.requireNonNull(str7);
                alymVar2.b |= 2;
                alymVar2.d = str7;
                return j$.util.Optional.ofNullable((defpackage.alym) akzxVarM5.p());
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                return ((defpackage.apjb) this.a).o(((java.lang.Integer) obj).intValue());
            case 12:
                return (defpackage.altp) ((defpackage.altp) obj).g((defpackage.altp) this.a).get();
            case 13:
                return ((defpackage.altp) obj).a(-((defpackage.altp) this.a).a);
            case 14:
                return (defpackage.altp) ((defpackage.altp) obj).g((defpackage.altp) this.a).get();
            case 15:
                defpackage.altp altpVar = (defpackage.altp) obj;
                akzx akzxVarM6 = defpackage.amfx.a.m();
                int i13 = altpVar.a;
                int i14 = ((defpackage.altp) this.a).a;
                akzxVarM6.u();
                defpackage.amfx amfxVar = (defpackage.amfx) akzxVarM6.b;
                amfxVar.b |= 1;
                amfxVar.c = i13 - i14;
                int i15 = altpVar.b - i14;
                akzxVarM6.u();
                defpackage.amfx amfxVar2 = (defpackage.amfx) akzxVarM6.b;
                amfxVar2.b |= 2;
                amfxVar2.d = i15;
                defpackage.amfw amfwVar = defpackage.amfw.LOW_CONFIDENCE;
                akzxVarM6.u();
                defpackage.amfx amfxVar3 = (defpackage.amfx) akzxVarM6.b;
                amfxVar3.e = amfwVar.f;
                amfxVar3.b |= 4;
                akzxVarM6.u();
                defpackage.amfx amfxVar4 = (defpackage.amfx) akzxVarM6.b;
                amfxVar4.b |= 8;
                amfxVar4.f = i13;
                return (defpackage.amfx) akzxVarM6.p();
            case 16:
                return java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() - ((defpackage.altp) this.a).a);
            case 17:
                return (defpackage.altp) ((defpackage.altp) obj).g((defpackage.altp) this.a).get();
            case 18:
                return ((defpackage.altp) obj).a(-((defpackage.altp) this.a).a);
            case 19:
                defpackage.altp altpVar2 = (defpackage.altp) obj;
                int i16 = altpVar2.a;
                ?? r14 = this.a;
                return altpVar2.d(((java.lang.Integer) ahvr.bi((java.lang.Iterable) r14, i16, (java.lang.Integer) ahvr.bk((java.lang.Iterable) r14))).intValue()).c(((java.lang.Integer) ahvr.bi((java.lang.Iterable) r14, altpVar2.b, (java.lang.Integer) ahvr.bk((java.lang.Iterable) r14))).intValue());
            default:
                return ((defpackage.altp) obj).f((java.lang.String) this.a);
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
            case 8:
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Function.-CC.$default$compose(this, function);
    }
}
