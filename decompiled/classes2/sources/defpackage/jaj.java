package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jaj implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jaj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33, types: [aonj, java.lang.Object] */
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return java.lang.Float.valueOf(((java.lang.Number) this.a.a()).longValue() / 60000.0f);
            case 1:
                return java.lang.Long.valueOf((long) ((java.lang.Number) ((aii) this.a).d()).floatValue());
            case 2:
                defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.jak(2), 9);
                java.lang.Object objOfNullable = this.a;
                j$.util.Optional optional = (j$.util.Optional) objOfNullable;
                if (true == optional.isPresent()) {
                    objOfNullable = j$.util.Optional.ofNullable(hvdVar.a.a(optional.get()));
                }
                aooh.e(objOfNullable, "map(...)");
                return java.lang.Long.valueOf(((java.lang.Number) aooh.p((j$.util.Optional) objOfNullable, 0L)).longValue());
            case 3:
                return ((defpackage.jgk) this.a).u.e();
            case 4:
                defpackage.jlm jlmVar = (defpackage.jlm) this.a;
                eos eosVar = new eos(jlmVar.c.T());
                defpackage.jlw jlwVar = jlmVar.b;
                eop eopVar = env.c;
                aoiu[] aoiuVarArr = new aoiu[1];
                defpackage.jmu jmuVarB = defpackage.jmu.b(jlwVar.f);
                if (jmuVarB == null) {
                    jmuVarB = defpackage.jmu.SCAM_SELECTOR_QUESTION_KEY_UNSPECIFIED;
                }
                aoiuVarArr[0] = new aoiu("question_key", jmuVarB);
                eosVar.b(eopVar, dpe.r(aoiuVarArr));
                return eosVar;
            case 5:
                return a.r((aomy) this.a);
            case 6:
                this.a.a(defpackage.kbr.a);
                return aojh.a;
            case 7:
                this.a.a(new defpackage.kbt(null));
                return aojh.a;
            case 8:
                try {
                    byte[] bArr = ((defpackage.kdy) this.a).w.b;
                    if (bArr == null) {
                        return null;
                    }
                    akzq akzqVarA = akzq.a();
                    aooh.e(akzqVarA, "getGeneratedRegistry(...)");
                    return alad.B(kui.a, bArr, akzqVarA);
                } catch (alaz e) {
                    throw new java.lang.AssertionError(e);
                }
            case 9:
                try {
                    byte[] bArr2 = ((defpackage.kdy) this.a).x.b;
                    if (bArr2 == null) {
                        return null;
                    }
                    akzq akzqVarA2 = akzq.a();
                    aooh.e(akzqVarA2, "getGeneratedRegistry(...)");
                    return (defpackage.omz) alad.B(defpackage.omz.a, bArr2, akzqVarA2);
                } catch (alaz e2) {
                    throw new java.lang.AssertionError(e2);
                }
            case 10:
                try {
                    byte[] bArr3 = ((defpackage.kdy) this.a).y.b;
                    if (bArr3 == null) {
                        return null;
                    }
                    akzq akzqVarA3 = akzq.a();
                    aooh.e(akzqVarA3, "getGeneratedRegistry(...)");
                    return (defpackage.jvx) alad.B(defpackage.jvx.b, bArr3, akzqVarA3);
                } catch (alaz e3) {
                    throw new java.lang.AssertionError(e3);
                }
            case 11:
                try {
                    byte[] bArr4 = ((defpackage.kdy) this.a).z.b;
                    if (bArr4 == null) {
                        return null;
                    }
                    akzq akzqVarA4 = akzq.a();
                    aooh.e(akzqVarA4, "getGeneratedRegistry(...)");
                    return alad.B(wgu.a, bArr4, akzqVarA4);
                } catch (alaz e4) {
                    throw new java.lang.AssertionError(e4);
                }
            case 12:
                try {
                    byte[] bArr5 = ((defpackage.kdy) this.a).A.b;
                    if (bArr5 == null) {
                        return null;
                    }
                    akzq akzqVarA5 = akzq.a();
                    aooh.e(akzqVarA5, "getGeneratedRegistry(...)");
                    return alad.B(mmy.a, bArr5, akzqVarA5);
                } catch (alaz e5) {
                    throw new java.lang.AssertionError(e5);
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                try {
                    byte[] bArr6 = ((defpackage.kdy) this.a).c.b;
                    if (bArr6 == null) {
                        return null;
                    }
                    akzq akzqVarA6 = akzq.a();
                    aooh.e(akzqVarA6, "getGeneratedRegistry(...)");
                    return (defpackage.hkd) alad.B(defpackage.hkd.a, bArr6, akzqVarA6);
                } catch (alaz e6) {
                    throw new java.lang.AssertionError(e6);
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                defpackage.hkd hkdVarB = ((defpackage.kdy) this.a).b();
                if (hkdVarB == null) {
                    return null;
                }
                java.lang.String str = hkdVarB.c;
                aooh.e(str, "getNormalizedNumber(...)");
                java.lang.String str2 = hkdVarB.d;
                aooh.e(str2, "getCountryIso(...)");
                akfx akfxVarH = akfx.h();
                aooh.e(akfxVarH, "getInstance(...)");
                return defpackage.orv.a(akfxVarH, str, akfg.b(str2));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return java.lang.Boolean.valueOf(akfy.a.a(((defpackage.kdy) this.a).l()));
            case 16:
                java.lang.String str3 = ((defpackage.kdy) this.a).d;
                if (str3 == null || !android.util.Patterns.EMAIL_ADDRESS.matcher(str3).matches()) {
                    return null;
                }
                java.lang.String lowerCase = str3.toLowerCase(java.util.Locale.ROOT);
                aooh.e(lowerCase, "toLowerCase(...)");
                return lowerCase;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                try {
                    byte[] bArr7 = ((defpackage.kdy) this.a).m.b;
                    if (bArr7 == null) {
                        return null;
                    }
                    akzq akzqVarA7 = akzq.a();
                    aooh.e(akzqVarA7, "getGeneratedRegistry(...)");
                    return (defpackage.kiw) alad.B(defpackage.kiw.a, bArr7, akzqVarA7);
                } catch (alaz e7) {
                    throw new java.lang.AssertionError(e7);
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                try {
                    byte[] bArr8 = ((defpackage.kdy) this.a).t.b;
                    if (bArr8 == null) {
                        return null;
                    }
                    akzq akzqVarA8 = akzq.a();
                    aooh.e(akzqVarA8, "getGeneratedRegistry(...)");
                    return alad.B(ucu.a, bArr8, akzqVarA8);
                } catch (alaz e8) {
                    throw new java.lang.AssertionError(e8);
                }
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                try {
                    byte[] bArr9 = ((defpackage.kdy) this.a).u.b;
                    if (bArr9 == null) {
                        return null;
                    }
                    akzq akzqVarA9 = akzq.a();
                    aooh.e(akzqVarA9, "getGeneratedRegistry(...)");
                    return alad.B(wxp.a, bArr9, akzqVarA9);
                } catch (alaz e9) {
                    throw new java.lang.AssertionError(e9);
                }
            default:
                try {
                    byte[] bArr10 = ((defpackage.kdy) this.a).v.b;
                    if (bArr10 == null) {
                        return null;
                    }
                    akzq akzqVarA10 = akzq.a();
                    aooh.e(akzqVarA10, "getGeneratedRegistry(...)");
                    return (defpackage.kir) alad.B(defpackage.kir.a, bArr10, akzqVarA10);
                } catch (alaz e10) {
                    throw new java.lang.AssertionError(e10);
                }
        }
    }
}
