package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abaw implements defpackage.abav {
    private final j$.util.Optional a;
    private final j$.util.Optional b;
    private final defpackage.adae c;

    public abaw(defpackage.adae adaeVar, j$.util.Optional optional, j$.util.Optional optional2) {
        defpackage.aooh.f(adaeVar, "clientRoleConfigProvider");
        defpackage.aooh.f(optional, "enableHadesEventStartedLogging");
        defpackage.aooh.f(optional2, "enableWestworldFeatureProviderInvocationStatsLogging");
        this.c = adaeVar;
        this.a = optional;
        this.b = optional2;
    }

    public static final int f(ykj ykjVar) {
        defpackage.aooh.f(ykjVar, "<this>");
        switch (ykjVar.ordinal()) {
            case 0:
                return 8;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 10;
            default:
                throw new defpackage.aois();
        }
    }

    public static final int g(int i) {
        switch (i - 1) {
            case 0:
                return 7;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                throw new defpackage.aois();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
        }
    }

    private final byte[] h(abbb abbbVar) {
        java.util.List arrayList;
        ajyu ajyuVarG;
        j$.time.Duration durationPlus;
        b bVarV;
        j$.time.Duration durationPlus2;
        agej agejVar;
        int i;
        defpackage.akzx akzxVarM = ageh.a.m();
        ajyu ajyuVarE = abbbVar.e.E();
        if (ajyuVarE != null) {
            int i2 = 0;
            defpackage.aopq aopqVarC = defpackage.aooc.C(0, ajyuVarE.w());
            arrayList = new java.util.ArrayList();
            aopp it = aopqVarC.iterator();
            while (it.a) {
                ajyu ajyuVarH = ajyuVarE.H(it.a());
                agei ageiVar = null;
                if (ajyuVarH != null) {
                    byte bU = ajyuVarH.u();
                    if (bU == 1 || bU == 3) {
                        if (((java.lang.Boolean) defpackage.aooh.p(this.b, java.lang.Boolean.FALSE)).booleanValue() && (ajyuVarG = ajyuVarH.G()) != null) {
                            ajyu ajyuVarD = ajyuVarG.d();
                            if (ajyuVarD == null || (durationPlus = j$.time.Duration.ofSeconds(ajyuVarD.m()).plus(j$.time.Duration.ofNanos(ajyu.J(ajyuVarD)))) == null) {
                                durationPlus = j$.time.Duration.ZERO;
                                defpackage.aooh.e(durationPlus, "ZERO");
                            }
                            defpackage.akzx akzxVarM2 = agei.a.m();
                            long millis = durationPlus.toMillis();
                            akzxVarM2.u();
                            agei ageiVar2 = akzxVarM2.b;
                            ageiVar2.b |= 1;
                            ageiVar2.c = millis;
                            int iA = ajyuVarH.a();
                            akzxVarM2.u();
                            agei ageiVar3 = akzxVarM2.b;
                            ageiVar3.b |= 16;
                            ageiVar3.h = iA;
                            if (ajyuVarH.u() == 3 && ajyuVarG.z() > 0) {
                                int i3 = true == ajyuVarG.C() ? 2 : 3;
                                akzxVarM2.u();
                                agei ageiVar4 = akzxVarM2.b;
                                ageiVar4.e = i3 - 1;
                                ageiVar4.b |= 2;
                                defpackage.akzx akzxVarM3 = agej.a.m();
                                akzxVarM3.u();
                                agej agejVar2 = akzxVarM3.b;
                                agejVar2.c = 1;
                                agejVar2.b |= 1;
                                int iZ = ajyuVarG.z();
                                akzxVarM3.u();
                                agej agejVar3 = akzxVarM3.b;
                                agejVar3.b |= 2;
                                agejVar3.d = iZ;
                                agej agejVarR = akzxVarM3.r();
                                akzxVarM2.u();
                                agei ageiVar5 = akzxVarM2.b;
                                j$.util.Objects.requireNonNull(agejVarR);
                                ageiVar5.b();
                                ageiVar5.d.add(agejVarR);
                            }
                            ageiVar = (agei) akzxVarM2.r();
                        }
                    } else if (bU == 5 && (bVarV = ajyuVarH.v()) != null) {
                        ajyu ajyuVarD2 = bVarV.d();
                        if (ajyuVarD2 == null || (durationPlus2 = j$.time.Duration.ofSeconds(ajyuVarD2.m()).plus(j$.time.Duration.ofNanos(ajyu.J(ajyuVarD2)))) == null) {
                            durationPlus2 = j$.time.Duration.ZERO;
                            defpackage.aooh.e(durationPlus2, "ZERO");
                        }
                        defpackage.akzx akzxVarM4 = agei.a.m();
                        int iA2 = bVarV.a();
                        akzxVarM4.u();
                        agei ageiVar6 = akzxVarM4.b;
                        ageiVar6.b |= 32;
                        ageiVar6.i = iA2;
                        int iC = bVarV.c();
                        akzxVarM4.u();
                        agei ageiVar7 = akzxVarM4.b;
                        ageiVar7.b |= 64;
                        ageiVar7.j = iC;
                        long millis2 = durationPlus2.toMillis();
                        akzxVarM4.u();
                        agei ageiVar8 = akzxVarM4.b;
                        ageiVar8.b |= 1;
                        ageiVar8.c = millis2;
                        int iA3 = ajyuVarH.a();
                        akzxVarM4.u();
                        agei ageiVar9 = akzxVarM4.b;
                        ageiVar9.b |= 16;
                        ageiVar9.h = iA3;
                        defpackage.aopq aopqVarC2 = defpackage.aooc.C(i2, bVarV.b());
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        aopp it2 = aopqVarC2.iterator();
                        while (it2.a) {
                            ajyu ajyuVarF = bVarV.f(it2.a());
                            if (ajyuVarF != null) {
                                defpackage.akzx akzxVarM5 = agej.a.m();
                                if (ajyuVarF.y() > 0) {
                                    i = 2;
                                } else {
                                    i = ajyu.J(ajyuVarF) > 0 ? 3 : 1;
                                }
                                akzxVarM5.u();
                                agej agejVar4 = akzxVarM5.b;
                                agejVar4.c = i - 1;
                                agejVar4.b |= 1;
                                int iY = ajyuVarF.y() + ajyu.J(ajyuVarF);
                                akzxVarM5.u();
                                agej agejVar5 = akzxVarM5.b;
                                agejVar5.b |= 2;
                                agejVar5.d = iY;
                                agejVar = (agej) akzxVarM5.r();
                            } else {
                                agejVar = null;
                            }
                            if (agejVar != null) {
                                arrayList2.add(agejVar);
                            }
                        }
                        akzxVarM4.u();
                        agei ageiVar10 = akzxVarM4.b;
                        ageiVar10.b();
                        defpackage.akyl.i(arrayList2, ageiVar10.d);
                        ajyu ajyuVarE2 = bVarV.e();
                        int iCR = ajyuVarE2 != null ? defpackage.afsq.cR(ajyuVarE2) : 1;
                        akzxVarM4.u();
                        agei ageiVar11 = akzxVarM4.b;
                        ageiVar11.f = iCR - 1;
                        ageiVar11.b |= 4;
                        ajyu ajyuVarE3 = bVarV.e();
                        int iCQ = ajyuVarE3 != null ? defpackage.afsq.cQ(ajyuVarE3.x()) : 1;
                        akzxVarM4.u();
                        agei ageiVar12 = akzxVarM4.b;
                        ageiVar12.g = iCQ - 1;
                        ageiVar12.b |= 8;
                        ageiVar = (agei) akzxVarM4.r();
                    }
                }
                if (ageiVar != null) {
                    arrayList.add(ageiVar);
                }
                i2 = 0;
            }
        } else {
            arrayList = defpackage.aokc.a;
        }
        akzxVarM.u();
        ageh agehVar = akzxVarM.b;
        defpackage.alat alatVar = agehVar.b;
        if (!alatVar.c()) {
            agehVar.b = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(arrayList, agehVar.b);
        return akzxVarM.r().i();
    }

    private static final int i(java.lang.Boolean bool) {
        if (defpackage.aooh.n(bool, java.lang.Boolean.TRUE)) {
            return 1;
        }
        if (defpackage.aooh.n(bool, java.lang.Boolean.FALSE)) {
            return 2;
        }
        if (bool == null) {
            return 0;
        }
        throw new defpackage.aois();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c5 A[PHI: r1
      0x00c5: PHI (r1v13 int) = (r1v12 int), (r1v14 int) binds: [B:34:0x00bd, B:38:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.abav
    public final void a(defpackage.aazd aazdVar, defpackage.akzc akzcVar, long j, abbb abbbVar) throws java.io.IOException {
        java.lang.Object next;
        java.lang.Boolean boolValueOf;
        java.lang.Long lValueOf;
        int[] iArrCm;
        java.lang.Object next2;
        defpackage.aooh.f(aazdVar, "clientId");
        defpackage.aooh.f(akzcVar, "protectionToken");
        java.util.Iterator it = abbbVar.d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((abbd) next).b);
        abbd abbdVar = (abbd) next;
        if (abbdVar == null) {
            java.util.Iterator it2 = abbbVar.d().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((abbd) next2).a <= 0);
            abbdVar = (abbd) next2;
            if (abbdVar == null) {
                abbdVar = (abbd) defpackage.ajsz.bG(abbbVar.d());
            }
        }
        j$.time.Duration duration = abbbVar.a;
        defpackage.aooh.e(j$.time.Duration.ZERO, "ZERO");
        abbi abbiVarB = abbbVar.b();
        abbg abbgVarA = abbbVar.a();
        java.lang.String strC = abbbVar.c();
        abay abayVar = abbbVar.d;
        if (abbdVar != null) {
            lValueOf = java.lang.Long.valueOf(abbdVar.a);
            boolValueOf = java.lang.Boolean.valueOf(abbdVar.b);
        } else {
            boolValueOf = null;
            lValueOf = null;
        }
        defpackage.aazf aazfVarF = this.c.F(aazdVar);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            if (abbgVarA != null) {
                java.util.List list = abbgVarA.a;
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
                java.util.Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    byte b = ((aoiz) it3.next()).a;
                    int i = 1;
                    java.util.Iterator it4 = it3;
                    if (b != 0) {
                        int i2 = 2;
                        if (b != 1) {
                            i = 3;
                            if (b != 2) {
                                i2 = 4;
                                if (b == 3) {
                                    i = i2;
                                } else {
                                    i = b == 4 ? 5 : 1;
                                }
                            }
                        } else {
                            i = i2;
                        }
                    }
                    arrayList.add(java.lang.Integer.valueOf(i - 1));
                    it3 = it4;
                }
                iArrCm = defpackage.ajsz.cm(arrayList);
            } else {
                iArrCm = null;
            }
            if (iArrCm != null) {
                java.lang.String strC2 = aazdVar.c();
                long jB = abas.b(aazdVar);
                byte[] bArrD = akzcVar.D();
                long millis = duration.toMillis();
                java.lang.Boolean bool = boolValueOf;
                int iF = f(defpackage.aaoo.w(abbiVarB.a)) - 1;
                int iG = g(defpackage.aaoo.x(abbiVarB.b)) - 1;
                int iC = abas.c(abayVar) - 1;
                java.lang.Long l = lValueOf;
                int i3 = aazfVarF.c;
                int i4 = aazfVarF.d;
                int i5 = aazfVarF.e;
                java.lang.String strD = aazdVar.d();
                if (strD == null) {
                    strD = "";
                }
                long jLongValue = l != null ? l.longValue() : 0L;
                int i6 = i(bool);
                byte[] bArrH = h(abbbVar);
                android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
                builderNewBuilder.setAtomId(211410);
                builderNewBuilder.writeString(strC2);
                builderNewBuilder.writeLong(jB);
                builderNewBuilder.writeByteArray(bArrD);
                builderNewBuilder.writeLong(millis);
                builderNewBuilder.writeInt(iF);
                builderNewBuilder.writeInt(iG);
                builderNewBuilder.writeIntArray(iArrCm);
                builderNewBuilder.writeInt(iC);
                builderNewBuilder.writeLong(0L);
                builderNewBuilder.writeInt(0);
                builderNewBuilder.writeInt(0);
                builderNewBuilder.writeInt(0);
                builderNewBuilder.writeString(strD);
                builderNewBuilder.writeLong(j);
                builderNewBuilder.writeLong(1001915728L);
                builderNewBuilder.writeLong(jLongValue);
                builderNewBuilder.writeInt(i6);
                builderNewBuilder.writeByteArray(bArrH);
                builderNewBuilder.usePooledBuffer();
                android.util.StatsLog.write(builderNewBuilder.build());
                return;
            }
        }
        java.lang.Boolean bool2 = boolValueOf;
        java.lang.Long l2 = lValueOf;
        java.lang.String strC3 = aazdVar.c();
        long jB2 = abas.b(aazdVar);
        byte[] bArrD2 = akzcVar.D();
        long millis2 = duration.toMillis();
        int iF2 = f(defpackage.aaoo.w(abbiVarB.a)) - 1;
        int iG2 = g(defpackage.aaoo.x(abbiVarB.b)) - 1;
        if (abbgVarA != null) {
            java.util.List list2 = abbgVarA.a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(list2, 10));
            java.util.Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                arrayList2.add(java.lang.String.valueOf(((aoiz) it5.next()).a & 255));
            }
            strC = defpackage.ajsz.cr(arrayList2, ",", null, null, null, 62);
        }
        int iC2 = abas.c(abayVar) - 1;
        int i7 = aazfVarF.c;
        int i8 = aazfVarF.d;
        int i9 = aazfVarF.e;
        java.lang.String strD2 = aazdVar.d();
        if (strD2 == null) {
            strD2 = "";
        }
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        int i10 = i(bool2);
        byte[] bArrH2 = h(abbbVar);
        android.util.StatsEvent.Builder builderNewBuilder2 = android.util.StatsEvent.newBuilder();
        builderNewBuilder2.setAtomId(211400);
        builderNewBuilder2.writeString(strC3);
        builderNewBuilder2.writeLong(jB2);
        builderNewBuilder2.writeByteArray(bArrD2);
        builderNewBuilder2.writeLong(millis2);
        builderNewBuilder2.writeLong(0L);
        builderNewBuilder2.writeInt(iF2);
        builderNewBuilder2.writeInt(iG2);
        builderNewBuilder2.writeString(strC);
        builderNewBuilder2.writeInt(iC2);
        builderNewBuilder2.writeLong(0L);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeString(strD2);
        builderNewBuilder2.writeLong(j);
        builderNewBuilder2.writeLong(1001915728L);
        builderNewBuilder2.writeLong(jLongValue2);
        builderNewBuilder2.writeInt(i10);
        builderNewBuilder2.writeByteArray(bArrH2);
        builderNewBuilder2.usePooledBuffer();
        android.util.StatsLog.write(builderNewBuilder2.build());
    }

    @Override // defpackage.abav
    public final void b(defpackage.aazd aazdVar, defpackage.akzc akzcVar, long j, long j2, abay abayVar, alez alezVar, aley aleyVar) {
        defpackage.aooh.f(aazdVar, "clientId");
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.aooh.f(abayVar, "classificationBackend");
        defpackage.aooh.f(alezVar, "status");
        defpackage.aooh.f(aleyVar, "errorMessage");
        defpackage.aazf aazfVarF = this.c.F(aazdVar);
        java.lang.String strC = aazdVar.c();
        long jB = abas.b(aazdVar);
        byte[] bArrD = akzcVar.D();
        int iC = abas.c(abayVar) - 1;
        int iY = defpackage.aaoo.y(alezVar) - 1;
        int i = aazfVarF.c;
        int i2 = aazfVarF.d;
        int i3 = aazfVarF.e;
        int iA = aleyVar.a();
        java.lang.String strD = aazdVar.d();
        android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
        builderNewBuilder.setAtomId(211407);
        builderNewBuilder.writeString(strC);
        builderNewBuilder.writeLong(jB);
        builderNewBuilder.writeByteArray(bArrD);
        builderNewBuilder.writeLong(j2);
        builderNewBuilder.writeInt(iC);
        builderNewBuilder.writeInt(iY);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(0);
        builderNewBuilder.writeInt(iA);
        builderNewBuilder.writeLong(0L);
        builderNewBuilder.writeString(strD);
        builderNewBuilder.writeLong(1001915728L);
        builderNewBuilder.writeLong(j);
        builderNewBuilder.usePooledBuffer();
        android.util.StatsLog.write(builderNewBuilder.build());
    }

    @Override // defpackage.abav
    public final void c(defpackage.aazd aazdVar, long j, defpackage.akzc akzcVar, long j2, alez alezVar, aley aleyVar) {
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.aooh.f(alezVar, "status");
        defpackage.aooh.f(aleyVar, "errorMessage");
        defpackage.aazf aazfVarF = this.c.F(aazdVar);
        if (alezVar == alez.a) {
            java.lang.String strC = aazdVar.c();
            long jB = abas.b(aazdVar);
            byte[] bArrD = akzcVar.D();
            int i = aazfVarF.c;
            int i2 = aazfVarF.d;
            int i3 = aazfVarF.e;
            java.lang.String strD = aazdVar.d();
            android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(211401);
            builderNewBuilder.writeString(strC);
            builderNewBuilder.writeLong(jB);
            builderNewBuilder.writeByteArray(bArrD);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeLong(0L);
            builderNewBuilder.writeString(strD);
            builderNewBuilder.writeLong(1001915728L);
            builderNewBuilder.writeLong(j2);
            builderNewBuilder.usePooledBuffer();
            android.util.StatsLog.write(builderNewBuilder.build());
            return;
        }
        java.lang.String strC2 = aazdVar.c();
        long jB2 = abas.b(aazdVar);
        int iZ = defpackage.aaoo.z(alezVar) - 1;
        int i4 = aazfVarF.c;
        int i5 = aazfVarF.d;
        int i6 = aazfVarF.e;
        int iA = aleyVar.a();
        java.lang.String strD2 = aazdVar.d();
        android.util.StatsEvent.Builder builderNewBuilder2 = android.util.StatsEvent.newBuilder();
        builderNewBuilder2.setAtomId(211402);
        builderNewBuilder2.writeString(strC2);
        builderNewBuilder2.writeLong(jB2);
        builderNewBuilder2.writeInt(iZ);
        builderNewBuilder2.writeLong(j);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(iA);
        builderNewBuilder2.writeLong(0L);
        builderNewBuilder2.writeString(strD2);
        builderNewBuilder2.writeLong(1001915728L);
        builderNewBuilder2.writeLong(j2);
        builderNewBuilder2.usePooledBuffer();
        android.util.StatsLog.write(builderNewBuilder2.build());
    }

    @Override // defpackage.abav
    public final void d(defpackage.aazd aazdVar, defpackage.akzc akzcVar, ykh ykhVar) {
        int iAX;
        int iAX2;
        int iAX3;
        int iAX4;
        defpackage.aooh.f(akzcVar, "protectionToken");
        defpackage.aooh.f(ykhVar, "protectionDownload");
        defpackage.aazf aazfVarF = this.c.F(aazdVar);
        defpackage.aooh.f(ykhVar, "protectionDownload");
        int i = ykhVar.c;
        int iAX5 = defpackage.a.aX(i);
        int i2 = 3;
        if ((iAX5 != 0 && iAX5 == 2) || (((iAX = defpackage.a.aX(i)) != 0 && iAX == 7) || (((iAX2 = defpackage.a.aX(i)) != 0 && iAX2 == 8) || (((iAX3 = defpackage.a.aX(i)) != 0 && iAX3 == 10) || ((iAX4 = defpackage.a.aX(i)) != 0 && iAX4 == 12))))) {
            java.lang.String strC = aazdVar.c();
            long jB = abas.b(aazdVar);
            byte[] bArrD = akzcVar.D();
            long j = ykhVar.d;
            int iAN = defpackage.a.aN(ykhVar.f);
            if (iAN == 0) {
                iAN = 1;
            }
            int iA = abas.a(ykhVar);
            yjv yjvVar = ykhVar.e;
            if (yjvVar == null) {
                yjvVar = yjv.a;
            }
            int iAg = defpackage.a.ag(yjvVar.c);
            if (iAg == 0) {
                iAg = 1;
            }
            int iAX6 = defpackage.a.aX(ykhVar.c);
            if (iAX6 == 0) {
                iAX6 = 1;
            }
            int i3 = iAX6 - 1;
            if (i3 == 1) {
                i2 = 1;
            } else if (i3 == 9) {
                i2 = 4;
            } else if (i3 == 11) {
                i2 = 5;
            } else if (i3 == 6) {
                i2 = 2;
            } else if (i3 != 7) {
                i2 = 0;
            }
            int i4 = aazfVarF.c;
            int i5 = aazfVarF.d;
            int i6 = aazfVarF.e;
            java.lang.String strD = aazdVar.d();
            android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(211403);
            builderNewBuilder.writeString(strC);
            builderNewBuilder.writeLong(jB);
            builderNewBuilder.writeByteArray(bArrD);
            builderNewBuilder.writeLong(j);
            builderNewBuilder.writeInt(iAN - 1);
            builderNewBuilder.writeInt(iA);
            builderNewBuilder.writeInt(iAg - 1);
            builderNewBuilder.writeInt(i2);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeInt(0);
            builderNewBuilder.writeLong(0L);
            builderNewBuilder.writeString(strD);
            builderNewBuilder.writeLong(1001915728L);
            builderNewBuilder.writeLong(0L);
            builderNewBuilder.usePooledBuffer();
            android.util.StatsLog.write(builderNewBuilder.build());
            return;
        }
        java.lang.String strC2 = aazdVar.c();
        long jB2 = abas.b(aazdVar);
        long j2 = ykhVar.d;
        int iAN2 = defpackage.a.aN(ykhVar.f);
        if (iAN2 == 0) {
            iAN2 = 1;
        }
        int iAX7 = defpackage.a.aX(ykhVar.c);
        if (iAX7 == 0) {
            iAX7 = 1;
        }
        int i7 = iAX7 - 1;
        if (i7 == 2) {
            i2 = 1;
        } else if (i7 == 3) {
            i2 = 2;
        } else if (i7 != 4) {
            if (i7 == 5) {
                i2 = 4;
            } else if (i7 != 8) {
                i2 = i7 != 10 ? 0 : 6;
            } else {
                i2 = 5;
            }
        }
        yjv yjvVar2 = ykhVar.e;
        if (yjvVar2 == null) {
            yjvVar2 = yjv.a;
        }
        int iAg2 = defpackage.a.ag(yjvVar2.c);
        if (iAg2 == 0) {
            iAg2 = 1;
        }
        int iA2 = abas.a(ykhVar);
        int i8 = aazfVarF.c;
        int i9 = aazfVarF.d;
        int i10 = aazfVarF.e;
        int iQ = xfh.q(ykhVar.g);
        int i11 = iQ != 0 ? iQ : 1;
        java.lang.String strD2 = aazdVar.d();
        android.util.StatsEvent.Builder builderNewBuilder2 = android.util.StatsEvent.newBuilder();
        builderNewBuilder2.setAtomId(211404);
        builderNewBuilder2.writeString(strC2);
        builderNewBuilder2.writeLong(jB2);
        builderNewBuilder2.writeLong(j2);
        builderNewBuilder2.writeInt(iAN2 - 1);
        builderNewBuilder2.writeInt(i2);
        builderNewBuilder2.writeInt(iAg2 - 1);
        builderNewBuilder2.writeInt(iA2);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(0);
        builderNewBuilder2.writeInt(i11 - 1);
        builderNewBuilder2.writeLong(0L);
        builderNewBuilder2.writeString(strD2);
        builderNewBuilder2.writeLong(1001915728L);
        builderNewBuilder2.writeLong(0L);
        builderNewBuilder2.usePooledBuffer();
        android.util.StatsLog.write(builderNewBuilder2.build());
    }

    @Override // defpackage.abav
    public final void e(defpackage.aazd aazdVar, int i) {
        if (((java.lang.Boolean) defpackage.aooh.p(this.a, java.lang.Boolean.FALSE)).booleanValue()) {
            java.lang.String strC = aazdVar.c();
            long jB = abas.b(aazdVar);
            java.lang.String strD = aazdVar.d();
            android.util.StatsEvent.Builder builderNewBuilder = android.util.StatsEvent.newBuilder();
            builderNewBuilder.setAtomId(211409);
            builderNewBuilder.writeString(strC);
            builderNewBuilder.writeLong(jB);
            builderNewBuilder.writeLong(0L);
            builderNewBuilder.writeInt(i - 1);
            builderNewBuilder.writeString(strD);
            builderNewBuilder.writeLong(1001915728L);
            builderNewBuilder.usePooledBuffer();
            android.util.StatsLog.write(builderNewBuilder.build());
        }
    }
}
