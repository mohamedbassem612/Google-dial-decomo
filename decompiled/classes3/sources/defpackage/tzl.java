package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzl {
    public final tzq a;
    public final agtc b;

    public tzl(tzq tzqVar, ajct ajctVar, rsr rsrVar) {
        this.a = tzqVar;
        this.b = new agtc(new defpackage.plx(rsrVar, 14), ajctVar);
    }

    public final ajcq a(final defpackage.uab uabVar, final int i) {
        return ahvr.H(this.b.a(), new ahyc() { // from class: tzp
            public final java.lang.Object apply(java.lang.Object obj) {
                defpackage.tzn tznVar;
                java.lang.String str;
                defpackage.acui acuiVar = (defpackage.acui) obj;
                if (acuiVar == null) {
                    tzq.a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sonic/impl/mdd/SonicMddRepository", "getSonicFileUriInternal", 205, "SonicMddRepository.java").y("no ClientFileGroup for %s", defpackage.tzm.a.c);
                    return j$.util.Optional.empty();
                }
                defpackage.uab uabVar2 = uabVar;
                int iOrdinal = uabVar2.ordinal();
                if (iOrdinal == 0) {
                    akzx akzxVarM = defpackage.tzn.a.m();
                    akzxVarM.u();
                    defpackage.tzn tznVar2 = (defpackage.tzn) akzxVarM.b;
                    j$.util.Objects.requireNonNull("sonic_applause_audio");
                    tznVar2.f = "sonic_applause_audio";
                    akzxVarM.u();
                    defpackage.tzn tznVar3 = (defpackage.tzn) akzxVarM.b;
                    j$.util.Objects.requireNonNull("sonic_applause_audio_with_haptics");
                    tznVar3.e = "sonic_applause_audio_with_haptics";
                    akzxVarM.u();
                    defpackage.tzn tznVar4 = (defpackage.tzn) akzxVarM.b;
                    j$.util.Objects.requireNonNull("sonic_applause_animat_bg");
                    tznVar4.c = "sonic_applause_animat_bg";
                    akzxVarM.u();
                    defpackage.tzn tznVar5 = (defpackage.tzn) akzxVarM.b;
                    j$.util.Objects.requireNonNull("sonic_applause_animat_fg");
                    tznVar5.b |= 1;
                    tznVar5.d = "sonic_applause_animat_fg";
                    tznVar = (defpackage.tzn) akzxVarM.p();
                } else if (iOrdinal == 1) {
                    akzx akzxVarM2 = defpackage.tzn.a.m();
                    akzxVarM2.u();
                    defpackage.tzn tznVar6 = (defpackage.tzn) akzxVarM2.b;
                    j$.util.Objects.requireNonNull("sonic_partypopper_audio");
                    tznVar6.f = "sonic_partypopper_audio";
                    akzxVarM2.u();
                    defpackage.tzn tznVar7 = (defpackage.tzn) akzxVarM2.b;
                    j$.util.Objects.requireNonNull("sonic_partypopper_audio_with_haptics");
                    tznVar7.e = "sonic_partypopper_audio_with_haptics";
                    akzxVarM2.u();
                    defpackage.tzn tznVar8 = (defpackage.tzn) akzxVarM2.b;
                    j$.util.Objects.requireNonNull("sonic_partypopper_animat_bg");
                    tznVar8.c = "sonic_partypopper_animat_bg";
                    akzxVarM2.u();
                    defpackage.tzn tznVar9 = (defpackage.tzn) akzxVarM2.b;
                    j$.util.Objects.requireNonNull("sonic_partypopper_animat_fg");
                    tznVar9.b |= 1;
                    tznVar9.d = "sonic_partypopper_animat_fg";
                    tznVar = (defpackage.tzn) akzxVarM2.p();
                } else if (iOrdinal == 2) {
                    akzx akzxVarM3 = defpackage.tzn.a.m();
                    akzxVarM3.u();
                    defpackage.tzn tznVar10 = (defpackage.tzn) akzxVarM3.b;
                    j$.util.Objects.requireNonNull("sonic_sad_audio");
                    tznVar10.f = "sonic_sad_audio";
                    akzxVarM3.u();
                    defpackage.tzn tznVar11 = (defpackage.tzn) akzxVarM3.b;
                    j$.util.Objects.requireNonNull("sonic_sad_audio_with_haptics");
                    tznVar11.e = "sonic_sad_audio_with_haptics";
                    akzxVarM3.u();
                    defpackage.tzn tznVar12 = (defpackage.tzn) akzxVarM3.b;
                    j$.util.Objects.requireNonNull("sonic_sad_animat_bg");
                    tznVar12.c = "sonic_sad_animat_bg";
                    akzxVarM3.u();
                    defpackage.tzn tznVar13 = (defpackage.tzn) akzxVarM3.b;
                    j$.util.Objects.requireNonNull("sonic_sad_animat_fg");
                    tznVar13.b |= 1;
                    tznVar13.d = "sonic_sad_animat_fg";
                    tznVar = (defpackage.tzn) akzxVarM3.p();
                } else if (iOrdinal == 3) {
                    akzx akzxVarM4 = defpackage.tzn.a.m();
                    akzxVarM4.u();
                    defpackage.tzn tznVar14 = (defpackage.tzn) akzxVarM4.b;
                    j$.util.Objects.requireNonNull("sonic_crylaugh_audio");
                    tznVar14.f = "sonic_crylaugh_audio";
                    akzxVarM4.u();
                    defpackage.tzn tznVar15 = (defpackage.tzn) akzxVarM4.b;
                    j$.util.Objects.requireNonNull("sonic_crylaugh_audio_with_haptics");
                    tznVar15.e = "sonic_crylaugh_audio_with_haptics";
                    akzxVarM4.u();
                    defpackage.tzn tznVar16 = (defpackage.tzn) akzxVarM4.b;
                    j$.util.Objects.requireNonNull("sonic_crylaugh_animat_bg");
                    tznVar16.c = "sonic_crylaugh_animat_bg";
                    akzxVarM4.u();
                    defpackage.tzn tznVar17 = (defpackage.tzn) akzxVarM4.b;
                    j$.util.Objects.requireNonNull("sonic_crylaugh_animat_fg");
                    tznVar17.b |= 1;
                    tznVar17.d = "sonic_crylaugh_animat_fg";
                    tznVar = (defpackage.tzn) akzxVarM4.p();
                } else if (iOrdinal == 4) {
                    akzx akzxVarM5 = defpackage.tzn.a.m();
                    akzxVarM5.u();
                    defpackage.tzn tznVar18 = (defpackage.tzn) akzxVarM5.b;
                    j$.util.Objects.requireNonNull("sonic_poop_audio");
                    tznVar18.f = "sonic_poop_audio";
                    akzxVarM5.u();
                    defpackage.tzn tznVar19 = (defpackage.tzn) akzxVarM5.b;
                    j$.util.Objects.requireNonNull("sonic_poop_audio_with_haptics");
                    tznVar19.e = "sonic_poop_audio_with_haptics";
                    akzxVarM5.u();
                    defpackage.tzn tznVar20 = (defpackage.tzn) akzxVarM5.b;
                    j$.util.Objects.requireNonNull("sonic_poop_animat_bg");
                    tznVar20.c = "sonic_poop_animat_bg";
                    akzxVarM5.u();
                    defpackage.tzn tznVar21 = (defpackage.tzn) akzxVarM5.b;
                    j$.util.Objects.requireNonNull("sonic_poop_animat_fg");
                    tznVar21.b |= 1;
                    tznVar21.d = "sonic_poop_animat_fg";
                    tznVar = (defpackage.tzn) akzxVarM5.p();
                } else {
                    if (iOrdinal != 5) {
                        throw new java.lang.IllegalArgumentException(a.bk(uabVar2.g, "SonicKey ", "does not exist"));
                    }
                    akzx akzxVarM6 = defpackage.tzn.a.m();
                    akzxVarM6.u();
                    defpackage.tzn tznVar22 = (defpackage.tzn) akzxVarM6.b;
                    j$.util.Objects.requireNonNull("sonic_drumroll_audio");
                    tznVar22.f = "sonic_drumroll_audio";
                    akzxVarM6.u();
                    defpackage.tzn tznVar23 = (defpackage.tzn) akzxVarM6.b;
                    j$.util.Objects.requireNonNull("sonic_drumroll_audio_with_haptics");
                    tznVar23.e = "sonic_drumroll_audio_with_haptics";
                    akzxVarM6.u();
                    defpackage.tzn tznVar24 = (defpackage.tzn) akzxVarM6.b;
                    j$.util.Objects.requireNonNull("sonic_drumroll_animat_bg");
                    tznVar24.c = "sonic_drumroll_animat_bg";
                    akzxVarM6.u();
                    defpackage.tzn tznVar25 = (defpackage.tzn) akzxVarM6.b;
                    j$.util.Objects.requireNonNull("sonic_drumroll_animat_fg");
                    tznVar25.b |= 1;
                    tznVar25.d = "sonic_drumroll_animat_fg";
                    tznVar = (defpackage.tzn) akzxVarM6.p();
                }
                int i2 = i - 1;
                if (i2 == 0) {
                    str = tznVar.f;
                } else if (i2 != 1) {
                    str = i2 != 2 ? tznVar.d : tznVar.c;
                } else {
                    str = tznVar.e;
                }
                j$.util.Optional optionalFindAny = j$.util.Collection.-EL.stream(acuiVar.h).filter(new defpackage.ree(str, 6)).findAny();
                return true == optionalFindAny.isPresent() ? j$.util.Optional.ofNullable(android.net.Uri.parse(((defpackage.acuh) optionalFindAny.get()).d)) : optionalFindAny;
            }
        }, this.a.b);
    }
}
