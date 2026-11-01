package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class ldt implements ahyc {
    public final /* synthetic */ ldu a;
    public final /* synthetic */ acvd b;

    public /* synthetic */ ldt(ldu lduVar, acvd acvdVar) {
        this.a = lduVar;
        this.b = acvdVar;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        j$.util.Optional optional = ((defpackage.lhr) obj).a;
        if (!optional.isPresent()) {
            ldu.a.b().l("com/android/dialer/callscreen/impl/mdd/ManifestConfigOverrider", "override", 63, "ManifestConfigOverrider.java").v("language code absent");
            return new java.util.ArrayList();
        }
        ldu lduVar = this.a;
        akff akffVar = (akff) optional.orElseThrow();
        if (!lduVar.c.d(akffVar)) {
            ldu.a.b().l("com/android/dialer/callscreen/impl/mdd/ManifestConfigOverrider", "override", 69, "ManifestConfigOverrider.java").y("languageCode %s is not supported", akffVar);
            return new java.util.ArrayList();
        }
        if (((akff) optional.orElseThrow()).e()) {
            ldu.a.b().l("com/android/dialer/callscreen/impl/mdd/ManifestConfigOverrider", "override", 74, "ManifestConfigOverrider.java").v("languageCode is unknown");
        }
        acvd acvdVar = this.b;
        aidf aidfVar = new aidf((byte[]) null);
        for (defpackage.acvb acvbVar : acvdVar.c) {
            if ((acvbVar.b & 1) != 0) {
                defpackage.acva acvaVar = acvbVar.c;
                if (acvaVar == null) {
                    acvaVar = defpackage.acva.a;
                }
                for (java.lang.String str : acvaVar.b) {
                    try {
                        optionalEmpty = j$.util.Optional.of(akff.a(str));
                    } catch (java.lang.IllegalArgumentException e) {
                        hgb.g(ldu.a.d(), "unable to parse locale %s", str, "com/android/dialer/callscreen/impl/mdd/ManifestConfigOverrider", "parse", (char) 201, "ManifestConfigOverrider.java", e, zct.b);
                        optionalEmpty = j$.util.Optional.empty();
                    }
                    if (optionalEmpty.isPresent()) {
                        akff akffVar2 = (akff) optionalEmpty.orElseThrow();
                        acux acuxVar = acvbVar.d;
                        if (acuxVar == null) {
                            acuxVar = acux.a;
                        }
                        aidfVar.t(akffVar2, acuxVar);
                    }
                }
            }
        }
        aimz aimzVar = ldu.a;
        aimzVar.b().l("com/android/dialer/callscreen/impl/mdd/ManifestConfigOverrider", "findDataFileGroupsForLanguage", 114, "ManifestConfigOverrider.java").y("configured language codes are %s", aidfVar.p());
        akff akffVar3 = akffVar;
        while (akffVar3 != null) {
            if (((aicr) aidfVar).a.containsKey(akffVar3)) {
                aimzVar.b().l("com/android/dialer/callscreen/impl/mdd/ManifestConfigOverrider", "findDataFileGroupsForLanguage", 119, "ManifestConfigOverrider.java").y("found dataFileGroup for %s", akffVar3);
                return aidfVar.f(akffVar3);
            }
            aimzVar.b().l("com/android/dialer/callscreen/impl/mdd/ManifestConfigOverrider", "findDataFileGroupsForLanguage", 123, "ManifestConfigOverrider.java").y("no dataFileGroup for %s", akffVar);
            akffVar3 = akffVar.q.equals(ldu.b) ? akff.e : akffVar3.r;
        }
        return new java.util.ArrayList();
    }
}
