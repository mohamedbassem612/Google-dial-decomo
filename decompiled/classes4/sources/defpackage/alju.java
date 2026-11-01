package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alju implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ alju(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v52, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v53, types: [java.lang.Object, java.util.List] */
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = 8;
        switch (this.$cid) {
            case 0:
                java.lang.String str = (java.lang.String) obj;
                akzx akzxVar = (akzx) this.a;
                defpackage.alsw alswVar = (defpackage.alsw) akzxVar.b;
                defpackage.alsn alsnVar = alswVar.b == 1 ? (defpackage.alsn) alswVar.c : defpackage.alsn.a;
                if ((alsnVar.b & 2) != 0) {
                    defpackage.alsm alsmVar = alsnVar.d;
                    if (alsmVar == null) {
                        alsmVar = defpackage.alsm.a;
                    }
                    if (!alsmVar.e) {
                        akzx akzxVarP = alsnVar.p();
                        defpackage.alsm alsmVar2 = alsnVar.d;
                        if (alsmVar2 == null) {
                            alsmVar2 = defpackage.alsm.a;
                        }
                        akzx akzxVarP2 = alsmVar2.p();
                        defpackage.alsm alsmVar3 = alsnVar.d;
                        if (alsmVar3 == null) {
                            alsmVar3 = defpackage.alsm.a;
                        }
                        java.lang.String string = j$.nio.file.Paths.get(str, new java.lang.String[]{java.lang.String.valueOf(alsmVar3.c).concat(".wav")}).toString();
                        akzxVarP2.u();
                        defpackage.alsm alsmVar4 = (defpackage.alsm) akzxVarP2.b;
                        j$.util.Objects.requireNonNull(string);
                        alsmVar4.b |= 1;
                        alsmVar4.c = string;
                        akzxVarP2.u();
                        defpackage.alsm alsmVar5 = (defpackage.alsm) akzxVarP2.b;
                        alsmVar5.b |= 4;
                        alsmVar5.e = true;
                        akzxVarP.u();
                        defpackage.alsn alsnVar2 = (defpackage.alsn) akzxVarP.b;
                        defpackage.alsm alsmVar6 = (defpackage.alsm) akzxVarP2.p();
                        j$.util.Objects.requireNonNull(alsmVar6);
                        alsnVar2.d = alsmVar6;
                        alsnVar2.b |= 2;
                        alsnVar = (defpackage.alsn) akzxVarP.p();
                    }
                }
                akzxVar.u();
                defpackage.alsw alswVar2 = (defpackage.alsw) akzxVar.b;
                j$.util.Objects.requireNonNull(alsnVar);
                alswVar2.c = alsnVar;
                alswVar2.b = 1;
                break;
            case 1:
                java.io.OutputStream outputStream = (java.io.OutputStream) ((aljc) this.a).c.remove((java.io.InputStream) obj);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e) {
                        a.by(aljc.a.b(), "Failed to close output stream.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/impl/AudioMulticaster", "closeInputStream", 'e', "AudioMulticaster.java", e);
                        return;
                    }
                }
                break;
            case 2:
                ((defpackage.amgv) obj).e((defpackage.altk) this.a);
                break;
            case 3:
                ((defpackage.amgv) obj).g((defpackage.aloa) this.a);
                break;
            case 4:
                this.a.add((defpackage.almy) obj);
                break;
            case 5:
                defpackage.amgv amgvVar = (defpackage.amgv) obj;
                j$.util.Objects.requireNonNull(amgvVar);
                defpackage.alju aljuVar = new defpackage.alju(amgvVar, i);
                j$.util.Optional optional = (j$.util.Optional) this.a;
                optional.isPresent();
                ((defpackage.amgv) aljuVar.a).d((defpackage.almy) optional.get());
                break;
            case 6:
                defpackage.almy almyVar = (defpackage.almy) obj;
                akzx akzxVar2 = (akzx) this.a;
                akzxVar2.u();
                defpackage.alna alnaVar = (defpackage.alna) akzxVar2.b;
                defpackage.alna alnaVar2 = defpackage.alna.a;
                j$.util.Objects.requireNonNull(almyVar);
                alat alatVar = alnaVar.b;
                if (!alatVar.c()) {
                    alnaVar.b = alad.J(alatVar);
                }
                alnaVar.b.add(almyVar);
                break;
            case 7:
                ((defpackage.amgv) obj).f((defpackage.almt) this.a);
                break;
            case 8:
                ((defpackage.amgv) this.a).d((defpackage.almy) obj);
                break;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                ((defpackage.alkk) this.a).g((defpackage.almz) obj);
                break;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                ((defpackage.alkv) this.a).g((defpackage.almy) obj);
                break;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                java.lang.Object obj2 = this.a;
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable((defpackage.almy) ((defpackage.alkv) obj2).b.remove((java.lang.String) obj));
                defpackage.alju aljuVar2 = new defpackage.alju(obj2, 10);
                if (true == optionalOfNullable.isPresent()) {
                    ((defpackage.alkv) aljuVar2.a).g((defpackage.almy) optionalOfNullable.get());
                }
                break;
            case 12:
                ((aigb) this.a).l((aigf) j$.util.Collection.-EL.stream(((aigf) obj).e()).collect(aido.b(new defpackage.aite(9), new defpackage.alki(8))));
                break;
            case 13:
                ((aift) this.a).i((java.lang.String) obj);
                break;
            case 14:
                defpackage.alka alkaVar = (defpackage.alka) obj;
                ((defpackage.allu) this.a).c.c(1);
                alkaVar.c.accept(alkaVar.a, alkaVar.b);
                break;
            case 15:
                j$.time.Duration duration = (j$.time.Duration) obj;
                ((defpackage.allx) this.a).c(new defpackage.allw(duration, true, 2), duration);
                break;
            case 16:
                ((defpackage.alqf) this.a).a((java.lang.String) obj);
                break;
            case 17:
                ((ajcb) obj).b(this.a);
                break;
            case 18:
                ((ajcb) obj).a((java.lang.Throwable) this.a);
                break;
            case 19:
                this.a.add((defpackage.alwe) obj);
                break;
            default:
                if (((defpackage.alwf) obj).d.isEmpty()) {
                    this.a.add(defpackage.alwf.a);
                }
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
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
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
