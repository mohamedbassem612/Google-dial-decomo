package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class ambg implements defpackage.alip, defpackage.alit {
    final /* synthetic */ defpackage.ambh a;

    public ambg(defpackage.ambh ambhVar) {
        j$.util.Objects.requireNonNull(ambhVar);
        this.a = ambhVar;
    }

    @Override // defpackage.alit
    public final defpackage.altm a(java.lang.String str) {
        return defpackage.altm.a;
    }

    @Override // defpackage.alip
    public final void m(defpackage.alio alioVar) {
        aliq aliqVar = new aliq();
        aliqVar.b(alioVar);
        aify aifyVar = aike.a;
        aliqVar.c(aifyVar);
        aliqVar.d(aifyVar);
        this.a.c.o(aliqVar.a());
    }

    @Override // defpackage.alip
    public final void n(defpackage.altn altnVar) {
        this.a.f.add(altnVar);
    }

    @Override // defpackage.alip
    public final void o(defpackage.alsi alsiVar) {
        j$.util.Optional optionalOf;
        defpackage.ambh.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/smartnotes/DuplexSummarizer$SummarizerListener", "onOutboundEvent", 90, "DuplexSummarizer.java").y("Received event %s", alsiVar);
        apdi apdiVar = defpackage.ambm.b;
        alsiVar.c(apdiVar);
        akzs akzsVar = ((alaa) alsiVar).n;
        alac alacVar = (alac) apdiVar.a;
        if (akzsVar.l(alacVar)) {
            alsiVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) alsiVar).n.j(alacVar);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.ambm ambmVar = (defpackage.ambm) objJ;
            apdi apdiVar2 = defpackage.ambn.h;
            ambmVar.c(apdiVar2);
            akzs akzsVar2 = ((alaa) ambmVar).n;
            alac alacVar2 = (alac) apdiVar2.a;
            if (akzsVar2.l(alacVar2)) {
                defpackage.ambh ambhVar = this.a;
                java.util.List list = ambhVar.e;
                list.add(alsiVar);
                ambmVar.c(apdiVar2);
                java.lang.Object objJ2 = ((alaa) ambmVar).n.j(alacVar2);
                if (objJ2 == null) {
                    objJ2 = apdiVar2.b;
                } else {
                    apdiVar2.c(objJ2);
                }
                ajdd ajddVar = ambhVar.c;
                aliq aliqVar = new aliq();
                aliqVar.c(aify.n(list));
                aliqVar.d(aify.n(ambhVar.f));
                int iAg = a.ag(((defpackage.ambn) objJ2).f);
                if (iAg == 0) {
                    iAg = 1;
                }
                switch (iAg - 1) {
                    case 1:
                        optionalOf = j$.util.Optional.of(new defpackage.alio("Feature is not available on the device", defpackage.alti.MODEL_FATAL_ERROR, new defpackage.ambf(iAg)));
                        break;
                    case 2:
                        optionalOf = j$.util.Optional.of(new defpackage.alio("Could not load feature in time for inference", defpackage.alti.MODEL_TRANSIENT_ERROR, new defpackage.ambf(iAg)));
                        break;
                    case 3:
                        optionalOf = j$.util.Optional.of(new defpackage.alio("Request input is unsafe", defpackage.alti.MODEL_FATAL_ERROR, new defpackage.ambf(iAg)));
                        break;
                    case 4:
                    case 6:
                        optionalOf = j$.util.Optional.of(new defpackage.alio("Output summary is unsafe", defpackage.alti.MODEL_FATAL_ERROR, new defpackage.ambf(iAg)));
                        break;
                    case 5:
                        optionalOf = j$.util.Optional.of(new defpackage.alio("Failed to perform inference", defpackage.alti.MODEL_TRANSIENT_ERROR, new defpackage.ambf(iAg)));
                        break;
                    case 7:
                        optionalOf = j$.util.Optional.of(new defpackage.alio("Request is too large for the model", defpackage.alti.MODEL_FATAL_ERROR, new defpackage.ambf(iAg)));
                        break;
                    default:
                        optionalOf = j$.util.Optional.empty();
                        break;
                }
                if (optionalOf == null) {
                    throw new java.lang.NullPointerException("Null exception");
                }
                aliqVar.b = optionalOf;
                ajddVar.o(aliqVar.a());
            }
        }
    }

    @Override // defpackage.alip
    public final void l() {
    }
}
