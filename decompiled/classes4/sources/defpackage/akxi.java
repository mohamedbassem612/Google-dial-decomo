package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akxi extends defpackage.akxe {
    public akxi(defpackage.akxy akxyVar) {
        super(akxyVar);
    }

    private static aify b(java.util.List list, defpackage.akxy akxyVar) {
        aift aiftVar = new aift(4);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            int iIntValue = num.intValue();
            aihd aihdVar = defpackage.akxg.a;
            akzx akzxVarM = defpackage.akya.a.m();
            int i = 3;
            switch (iIntValue) {
                case 68344477:
                case 69195241:
                case 69605552:
                case 70557198:
                case 72867899:
                case 73814155:
                case 75916514:
                case 81806614:
                case 82159412:
                case 87388084:
                case 96817595:
                case 101527765:
                case 104903338:
                case 108180415:
                case 108436427:
                case 109303191:
                case 111538494:
                case 112573462:
                case 112976253:
                case 114872520:
                case 115095178:
                case 116396109:
                case 117714891:
                case 122381546:
                case 122395678:
                case 122975727:
                case 127255101:
                case 127380830:
                case 128376602:
                case 134092141:
                    i = 4;
                    break;
                case 68435380:
                case 70701636:
                case 72175901:
                case 104729802:
                case 105535705:
                case 110734447:
                case 126290990:
                    break;
                case 70251319:
                case 72702104:
                case 73833047:
                case 75443034:
                case 76390225:
                    i = 2;
                    break;
                default:
                    i = 5;
                    break;
            }
            if (akxyVar.equals(defpackage.akxy.WORKSPACE_PROCESSING_USER_CONSENT_V2) && iIntValue == 75443034) {
                i = 4;
            }
            akzxVarM.u();
            defpackage.akya akyaVar = (defpackage.akya) akzxVarM.b;
            akyaVar.c = i - 1;
            akyaVar.b |= 1;
            boolean zContains = defpackage.akxg.a.contains(num);
            akzxVarM.u();
            defpackage.akya akyaVar2 = (defpackage.akya) akzxVarM.b;
            akyaVar2.b |= 2;
            akyaVar2.d = zContains;
            aiftVar.i((defpackage.akya) akzxVarM.p());
        }
        return aiftVar.h();
    }

    @Override // defpackage.akxe
    public final ajcq a(defpackage.alfr alfrVar, defpackage.akxw akxwVar, defpackage.akxt akxtVar) {
        final boolean z;
        aike aikeVarC = defpackage.aknx.c(alfrVar, akxtVar);
        defpackage.akxy akxyVar = this.a;
        aify aifyVarB = b(aikeVarC, akxyVar);
        final boolean zAnyMatch = j$.util.Collection.-EL.stream(aifyVarB).anyMatch(new zun(12));
        boolean zAnyMatch2 = j$.util.Collection.-EL.stream(aifyVarB).anyMatch(new zun(13));
        if (zAnyMatch) {
            z = zAnyMatch2;
        } else {
            if (!zAnyMatch2) {
                return aiql.z(d(2, 2));
            }
            z = true;
        }
        boolean z2 = !aifyVarB.isEmpty() && j$.util.Collection.-EL.stream(aifyVarB).allMatch(new zun(10));
        defpackage.akxv akxvVar = akxtVar.c;
        if (akxvVar == null) {
            akxvVar = defpackage.akxv.a;
        }
        alak alakVar = akxvVar.d;
        final aify aifyVarB2 = b(alakVar, akxyVar);
        if (z2) {
            if (j$.util.Collection.-EL.stream(aifyVarB2).allMatch(new zun(9))) {
                return aiql.z(d(2, 3));
            }
            if (!alakVar.isEmpty() && j$.util.Collection.-EL.stream(alakVar).allMatch(new zun(14))) {
                return aiql.z(d(2, 17));
            }
        }
        final boolean zAnyMatch3 = j$.util.Collection.-EL.stream(aifyVarB2).anyMatch(new zun(11));
        boolean z3 = aikeVarC.d == 1 && alakVar.size() == 1 && ((java.lang.Integer) aikeVarC.get(0)).equals(alakVar.get(0));
        if (!zAnyMatch && !zAnyMatch3 && z3) {
            return aiql.z(d(2, 4));
        }
        defpackage.akxo akxoVar = akxwVar.c;
        if (akxoVar == null) {
            akxoVar = defpackage.akxo.a;
        }
        java.lang.String str = akxoVar.c;
        return ajan.f(aiql.z(new defpackage.akxc()), new ahyc() { // from class: akxh
            public final java.lang.Object apply(java.lang.Object obj) {
                defpackage.akxi akxiVar = this.a;
                boolean z4 = zAnyMatch;
                if (z4 && zAnyMatch3) {
                    return akxiVar.d(3, 5);
                }
                boolean zAnyMatch4 = j$.util.Collection.-EL.stream(aifyVarB2).anyMatch(new zun(15));
                if (z4) {
                    if (zAnyMatch4) {
                        return akxiVar.d(3, 7);
                    }
                    zAnyMatch4 = false;
                }
                return (z && zAnyMatch4) ? akxiVar.d(3, 10) : akxiVar.e(2, j$.util.Optional.empty());
            }
        }, ajbm.a);
    }
}
