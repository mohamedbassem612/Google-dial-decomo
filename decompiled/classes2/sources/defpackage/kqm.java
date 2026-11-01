package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kqm {
    public static final defpackage.kqm a = new defpackage.kqm();
    private static final aimz b = aimz.i("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionsParser");

    /* JADX INFO: Thrown type has an unknown type hierarchy: aked */
    /* JADX INFO: Thrown type has an unknown type hierarchy: akei */
    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:175:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131 A[PHI: r18 r19 r20 r21 r22
      0x0131: PHI (r18v4 java.lang.String) = 
      (r18v2 java.lang.String)
      (r18v2 java.lang.String)
      (r18v5 java.lang.String)
      (r18v5 java.lang.String)
      (r18v6 java.lang.String)
      (r18v7 java.lang.String)
     binds: [B:95:0x0306, B:103:0x0354, B:85:0x025b, B:92:0x02ca, B:57:0x0127, B:73:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r19v4 java.lang.String) = 
      (r19v2 java.lang.String)
      (r19v2 java.lang.String)
      (r19v5 java.lang.String)
      (r19v5 java.lang.String)
      (r19v6 java.lang.String)
      (r19v7 java.lang.String)
     binds: [B:95:0x0306, B:103:0x0354, B:85:0x025b, B:92:0x02ca, B:57:0x0127, B:73:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r20v7 java.lang.String) = 
      (r20v5 java.lang.String)
      (r20v5 java.lang.String)
      (r20v8 java.lang.String)
      (r20v8 java.lang.String)
      (r20v9 java.lang.String)
      (r20v10 java.lang.String)
     binds: [B:95:0x0306, B:103:0x0354, B:85:0x025b, B:92:0x02ca, B:57:0x0127, B:73:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r21v9 java.lang.String) = 
      (r21v7 java.lang.String)
      (r21v7 java.lang.String)
      (r21v10 java.lang.String)
      (r21v10 java.lang.String)
      (r21v11 java.lang.String)
      (r21v13 java.lang.String)
     binds: [B:95:0x0306, B:103:0x0354, B:85:0x025b, B:92:0x02ca, B:57:0x0127, B:73:0x0209] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r22v9 java.lang.String) = 
      (r22v7 java.lang.String)
      (r22v7 java.lang.String)
      (r22v10 java.lang.String)
      (r22v10 java.lang.String)
      (r22v11 java.lang.String)
      (r22v15 java.lang.String)
     binds: [B:95:0x0306, B:103:0x0354, B:85:0x025b, B:92:0x02ca, B:57:0x0127, B:73:0x0209] A[DONT_GENERATE, DONT_INLINE]] */
    public final java.util.List a(java.lang.String str, j$.time.ZonedDateTime zonedDateTime) throws akei, aked, aois, defpackage.kpk {
        akeb akebVar;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        defpackage.kqx kqxVar;
        defpackage.kqx kqxVarB;
        boolean zMatches;
        java.lang.String str9 = "toCallActions";
        java.lang.String str10 = "com/android/dialer/callnotesinfra/summarizer/callaction/CallActionsParser";
        java.lang.String str11 = "<this>";
        aooh.f(str, "<this>");
        java.lang.String str12 = "callDateTime";
        aooh.f(zonedDateTime, "callDateTime");
        java.lang.String str13 = "CallActionsParser.kt";
        try {
            try {
                try {
                    akex akexVar = new akex(new java.io.StringReader(str));
                    akec akecVarM = agwm.m(akexVar);
                    if (!(akecVarM instanceof akee) && akexVar.b() != 10) {
                        throw new akei("Did not consume the entire document.");
                    }
                    aooh.e(akecVarM, "parseString(...)");
                    if (akecVarM instanceof akeb) {
                        akebVar = akecVarM.d();
                        if (!akebVar.a.isEmpty() && (akebVar.c() instanceof akeb)) {
                            akebVar = akebVar.c().d();
                        }
                    } else {
                        if (!(akecVarM instanceof akef)) {
                            throw new akei("Failed to parse actions JSON.");
                        }
                        akebVar = new akeb();
                        akebVar.b(akecVarM.e());
                    }
                    try {
                        try {
                            try {
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (java.lang.Object obj : akebVar) {
                                    if (((akec) obj) instanceof akef) {
                                        arrayList.add(obj);
                                    }
                                }
                                java.util.ArrayList<akef> arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
                                java.util.Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((akec) it.next()).e());
                                }
                                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                for (akef akefVar : arrayList2) {
                                    aooh.c(akefVar);
                                    aooh.f(akefVar, str11);
                                    aooh.f(zonedDateTime, str12);
                                    java.lang.String strM = defpackage.hgz.M(akefVar, "title");
                                    if (strM == null) {
                                        str4 = str9;
                                        str5 = str10;
                                        str7 = str11;
                                        str8 = str12;
                                        str6 = str13;
                                        kqxVar = null;
                                    } else {
                                        akec akecVarB = akefVar.b("properties");
                                        akef akefVarE = (akecVarB == null || !(akecVarB instanceof akef)) ? null : akecVarB.e();
                                        if (akefVarE == null || akefVarE.c().isEmpty()) {
                                            str4 = str9;
                                            str5 = str10;
                                            str7 = str11;
                                            str8 = str12;
                                            str6 = str13;
                                            kqxVar = null;
                                        } else {
                                            int iHashCode = strM.hashCode();
                                            if (iHashCode == -819413131) {
                                                str4 = str9;
                                                str5 = str10;
                                                str7 = str11;
                                                str8 = str12;
                                                str6 = str13;
                                                if (strM.equals("AddContactAction")) {
                                                    java.lang.String strM2 = defpackage.hgz.M(akefVarE, "name");
                                                    java.lang.String strM3 = defpackage.hgz.M(akefVarE, "phone_number");
                                                    defpackage.kqv kqvVar = defpackage.kqv.a;
                                                    akzx akzxVarM = kqvVar.m();
                                                    aooh.f(akzxVarM, "builder");
                                                    if (strM2 != null) {
                                                        akzxVarM.u();
                                                        defpackage.kqv kqvVar2 = (defpackage.kqv) akzxVarM.b;
                                                        j$.util.Objects.requireNonNull(strM2);
                                                        kqvVar2.b |= 16;
                                                        kqvVar2.d = strM2;
                                                    }
                                                    if (strM3 != null) {
                                                        akzxVarM.u();
                                                        defpackage.kqv kqvVar3 = (defpackage.kqv) akzxVarM.b;
                                                        j$.util.Objects.requireNonNull(strM3);
                                                        kqvVar3.b |= 4;
                                                        kqvVar3.c = strM3;
                                                    }
                                                    alad aladVarP = akzxVarM.p();
                                                    aooh.e(aladVarP, "build(...)");
                                                    defpackage.kqv kqvVar4 = (defpackage.kqv) aladVarP;
                                                    if (aooh.n(kqvVar4, kqvVar)) {
                                                        kqxVarB = null;
                                                    } else {
                                                        defpackage.oq oqVarZ = defpackage.hgz.Z(defpackage.kqx.a.m());
                                                        aooh.f(kqvVar4, "value");
                                                        java.lang.Object obj2 = oqVarZ.a;
                                                        ((akzx) obj2).u();
                                                        defpackage.kqx kqxVar2 = (defpackage.kqx) ((akzx) obj2).b;
                                                        j$.util.Objects.requireNonNull(kqvVar4);
                                                        kqxVar2.c = kqvVar4;
                                                        kqxVar2.b = 3;
                                                        kqxVarB = oqVarZ.B();
                                                    }
                                                } else {
                                                    kqxVarB = null;
                                                }
                                            } else if (iHashCode != -813229715) {
                                                if (iHashCode == 261453528 && strM.equals("CalendarInviteSmartAction")) {
                                                    java.lang.String strM4 = defpackage.hgz.M(akefVarE, "calendar_invite_name");
                                                    java.lang.String strM5 = defpackage.hgz.M(akefVarE, "location");
                                                    java.lang.String strM6 = defpackage.hgz.M(akefVarE, "description");
                                                    int i = defpackage.kqs.a;
                                                    aimz aimzVar = defpackage.kqo.a;
                                                    alcf alcfVarK = defpackage.hgz.K(defpackage.hgz.L(akefVarE, "start_"), zonedDateTime);
                                                    str7 = str11;
                                                    defpackage.kqo kqoVarL = defpackage.hgz.L(akefVarE, "end_");
                                                    j$.time.ZoneId zone = zonedDateTime.getZone();
                                                    str8 = str12;
                                                    aooh.e(zone, "getZone(...)");
                                                    aooh.f(alcfVarK, "startTimestamp");
                                                    aooh.f(zone, "callerTimezone");
                                                    str2 = str9;
                                                    str5 = str10;
                                                    try {
                                                        str4 = str2;
                                                        try {
                                                            str6 = str13;
                                                            try {
                                                                j$.time.ZonedDateTime zonedDateTimeAtZone = j$.time.Instant.ofEpochSecond(alcfVarK.b, alcfVarK.c).atZone(zone);
                                                                defpackage.kqn kqnVar = defpackage.kqn.a;
                                                                aooh.c(zonedDateTimeAtZone);
                                                                alcf alcfVarA = defpackage.kqs.a(kqoVarL, zonedDateTimeAtZone, kqnVar);
                                                                defpackage.kqw kqwVar = defpackage.kqw.a;
                                                                akzx akzxVarM2 = kqwVar.m();
                                                                aooh.f(akzxVarM2, "builder");
                                                                if (strM4 != null) {
                                                                    akzxVarM2.u();
                                                                    defpackage.kqw kqwVar2 = (defpackage.kqw) akzxVarM2.b;
                                                                    j$.util.Objects.requireNonNull(strM4);
                                                                    kqwVar2.b |= 1;
                                                                    kqwVar2.c = strM4;
                                                                }
                                                                if (strM5 != null) {
                                                                    akzxVarM2.u();
                                                                    defpackage.kqw kqwVar3 = (defpackage.kqw) akzxVarM2.b;
                                                                    j$.util.Objects.requireNonNull(strM5);
                                                                    kqwVar3.b |= 8;
                                                                    kqwVar3.f = strM5;
                                                                }
                                                                if (strM6 != null) {
                                                                    akzxVarM2.u();
                                                                    defpackage.kqw kqwVar4 = (defpackage.kqw) akzxVarM2.b;
                                                                    j$.util.Objects.requireNonNull(strM6);
                                                                    kqwVar4.b |= 16;
                                                                    kqwVar4.g = strM6;
                                                                }
                                                                aooh.f(alcfVarK, "value");
                                                                akzxVarM2.u();
                                                                defpackage.kqw kqwVar5 = (defpackage.kqw) akzxVarM2.b;
                                                                j$.util.Objects.requireNonNull(alcfVarK);
                                                                kqwVar5.d = alcfVarK;
                                                                kqwVar5.b |= 2;
                                                                aooh.f(alcfVarA, "value");
                                                                akzxVarM2.u();
                                                                defpackage.kqw kqwVar6 = (defpackage.kqw) akzxVarM2.b;
                                                                j$.util.Objects.requireNonNull(alcfVarA);
                                                                kqwVar6.e = alcfVarA;
                                                                kqwVar6.b |= 4;
                                                                alad aladVarP2 = akzxVarM2.p();
                                                                aooh.e(aladVarP2, "build(...)");
                                                                defpackage.kqw kqwVar7 = (defpackage.kqw) aladVarP2;
                                                                if (!aooh.n(kqwVar7, kqwVar)) {
                                                                    defpackage.oq oqVarZ2 = defpackage.hgz.Z(defpackage.kqx.a.m());
                                                                    aooh.f(kqwVar7, "value");
                                                                    java.lang.Object obj3 = oqVarZ2.a;
                                                                    ((akzx) obj3).u();
                                                                    defpackage.kqx kqxVar3 = (defpackage.kqx) ((akzx) obj3).b;
                                                                    j$.util.Objects.requireNonNull(kqwVar7);
                                                                    kqxVar3.c = kqwVar7;
                                                                    kqxVar3.b = 2;
                                                                    kqxVarB = oqVarZ2.B();
                                                                }
                                                            } catch (j$.time.DateTimeException e) {
                                                                e = e;
                                                                str10 = str5;
                                                                str2 = str4;
                                                                str3 = str6;
                                                                b.d().k(e).l(str10, str2, 50, str3).v("Failed to predict action timestamps.");
                                                                throw new defpackage.kpk(defpackage.kqz.RESPONSE_FORMAT_FAILURE, "Failed to predict action timestamps.", e);
                                                            } catch (java.lang.Exception e2) {
                                                                e = e2;
                                                                b.d().k(e).l(str5, str4, 58, str6).v("Unexpected failure during action parsing.");
                                                                throw new defpackage.kpk(defpackage.kqz.RESPONSE_FORMAT_FAILURE, "Unexpected failure during action parsing.", e);
                                                            }
                                                        } catch (java.lang.Exception e3) {
                                                            e = e3;
                                                            str6 = str13;
                                                            b.d().k(e).l(str5, str4, 58, str6).v("Unexpected failure during action parsing.");
                                                            throw new defpackage.kpk(defpackage.kqz.RESPONSE_FORMAT_FAILURE, "Unexpected failure during action parsing.", e);
                                                        } catch (j$.time.DateTimeException e4) {
                                                            e = e4;
                                                            str6 = str13;
                                                        }
                                                    } catch (j$.time.DateTimeException e5) {
                                                        e = e5;
                                                        str6 = str13;
                                                        str10 = str5;
                                                        str3 = str6;
                                                        b.d().k(e).l(str10, str2, 50, str3).v("Failed to predict action timestamps.");
                                                        throw new defpackage.kpk(defpackage.kqz.RESPONSE_FORMAT_FAILURE, "Failed to predict action timestamps.", e);
                                                    } catch (java.lang.Exception e6) {
                                                        e = e6;
                                                        str4 = str2;
                                                    }
                                                } else {
                                                    str4 = str9;
                                                    str5 = str10;
                                                    str7 = str11;
                                                    str8 = str12;
                                                    str6 = str13;
                                                }
                                                kqxVarB = null;
                                            } else {
                                                str4 = str9;
                                                str5 = str10;
                                                str7 = str11;
                                                str8 = str12;
                                                str6 = str13;
                                                if (strM.equals("ReminderSmartAction")) {
                                                    java.lang.String strM7 = defpackage.hgz.M(akefVarE, "reminder_text");
                                                    java.lang.String strM8 = defpackage.hgz.M(akefVarE, "location");
                                                    int i2 = defpackage.kqs.a;
                                                    aimz aimzVar2 = defpackage.kqo.a;
                                                    alcf alcfVarK2 = defpackage.hgz.K(defpackage.hgz.L(akefVarE, ""), zonedDateTime);
                                                    defpackage.krb krbVar = defpackage.krb.a;
                                                    akzx akzxVarM3 = krbVar.m();
                                                    aooh.f(akzxVarM3, "builder");
                                                    if (strM7 != null) {
                                                        akzxVarM3.u();
                                                        defpackage.krb krbVar2 = (defpackage.krb) akzxVarM3.b;
                                                        j$.util.Objects.requireNonNull(strM7);
                                                        krbVar2.b |= 1;
                                                        krbVar2.c = strM7;
                                                    }
                                                    if (strM8 != null) {
                                                        akzxVarM3.u();
                                                        defpackage.krb krbVar3 = (defpackage.krb) akzxVarM3.b;
                                                        j$.util.Objects.requireNonNull(strM8);
                                                        krbVar3.b |= 8;
                                                        krbVar3.e = strM8;
                                                    }
                                                    aooh.f(alcfVarK2, "value");
                                                    akzxVarM3.u();
                                                    defpackage.krb krbVar4 = (defpackage.krb) akzxVarM3.b;
                                                    j$.util.Objects.requireNonNull(alcfVarK2);
                                                    krbVar4.d = alcfVarK2;
                                                    krbVar4.b |= 2;
                                                    alad aladVarP3 = akzxVarM3.p();
                                                    aooh.e(aladVarP3, "build(...)");
                                                    defpackage.krb krbVar5 = (defpackage.krb) aladVarP3;
                                                    if (aooh.n(krbVar5, krbVar)) {
                                                        kqxVarB = null;
                                                    } else {
                                                        defpackage.oq oqVarZ3 = defpackage.hgz.Z(defpackage.kqx.a.m());
                                                        aooh.f(krbVar5, "value");
                                                        java.lang.Object obj4 = oqVarZ3.a;
                                                        ((akzx) obj4).u();
                                                        defpackage.kqx kqxVar4 = (defpackage.kqx) ((akzx) obj4).b;
                                                        j$.util.Objects.requireNonNull(krbVar5);
                                                        kqxVar4.c = krbVar5;
                                                        kqxVar4.b = 1;
                                                        kqxVarB = oqVarZ3.B();
                                                    }
                                                } else {
                                                    kqxVarB = null;
                                                }
                                            }
                                            if (kqxVarB != null) {
                                                aimz aimzVar3 = defpackage.kql.a;
                                                int i3 = kqxVarB.b;
                                                int iX = a.X(i3);
                                                int i4 = iX - 1;
                                                if (iX == 0) {
                                                    throw null;
                                                }
                                                if (i4 == 0) {
                                                    defpackage.krb krbVar6 = i3 == 1 ? (defpackage.krb) kqxVarB.c : defpackage.krb.a;
                                                    aooh.e(krbVar6, "getReminder(...)");
                                                    java.lang.String str14 = krbVar6.c;
                                                    aooh.e(str14, "getReminderText(...)");
                                                    if (str14.length() == 0) {
                                                        defpackage.kql.a.d().l("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionValidation", "isReminderValid", 55, "CallActionValidation.kt").v("Reminder action has empty text.");
                                                    } else {
                                                        alcf alcfVar = krbVar6.d;
                                                        if (alcfVar == null) {
                                                            alcfVar = alcf.a;
                                                        }
                                                        if (aooh.n(alcfVar, defpackage.kql.b)) {
                                                            defpackage.kql.a.d().l("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionValidation", "isReminderValid", 59, "CallActionValidation.kt").v("Reminder action has empty begin time.");
                                                        } else {
                                                            zMatches = true;
                                                        }
                                                    }
                                                    zMatches = false;
                                                } else if (i4 == 1) {
                                                    defpackage.kqw kqwVar8 = i3 == 2 ? (defpackage.kqw) kqxVarB.c : defpackage.kqw.a;
                                                    aooh.e(kqwVar8, "getCalendarInvite(...)");
                                                    java.lang.String str15 = kqwVar8.c;
                                                    aooh.e(str15, "getCalendarInviteTitle(...)");
                                                    if (str15.length() == 0) {
                                                        defpackage.kql.a.d().l("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionValidation", "isCalendarInviteValid", 35, "CallActionValidation.kt").v("Calendar invite action has empty title.");
                                                    } else {
                                                        alcf alcfVar2 = kqwVar8.d;
                                                        if (alcfVar2 == null) {
                                                            alcfVar2 = alcf.a;
                                                        }
                                                        alcf alcfVar3 = defpackage.kql.b;
                                                        if (aooh.n(alcfVar2, alcfVar3)) {
                                                            defpackage.kql.a.d().l("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionValidation", "isCalendarInviteValid", 39, "CallActionValidation.kt").v("Calendar invite action has empty begin time.");
                                                        } else {
                                                            alcf alcfVar4 = kqwVar8.e;
                                                            if (alcfVar4 == null) {
                                                                alcfVar4 = alcf.a;
                                                            }
                                                            if (aooh.n(alcfVar4, alcfVar3)) {
                                                                defpackage.kql.a.d().l("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionValidation", "isCalendarInviteValid", 43, "CallActionValidation.kt").v("Calendar invite action has empty end time.");
                                                            } else {
                                                                alcf alcfVar5 = kqwVar8.d;
                                                                if (alcfVar5 == null) {
                                                                    alcfVar5 = alcf.a;
                                                                }
                                                                long j = alcfVar5.b;
                                                                alcf alcfVar6 = kqwVar8.e;
                                                                if (alcfVar6 == null) {
                                                                    alcfVar6 = alcf.a;
                                                                }
                                                                if (j > alcfVar6.b) {
                                                                    defpackage.kql.a.d().l("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionValidation", "isCalendarInviteValid", 47, "CallActionValidation.kt").v("Calendar invite action has end time before begin time.");
                                                                } else {
                                                                    zMatches = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    zMatches = false;
                                                } else {
                                                    if (i4 != 2) {
                                                        if (i4 != 3) {
                                                            throw new aois();
                                                        }
                                                        throw new java.lang.IllegalArgumentException("Call action has no action set.");
                                                    }
                                                    defpackage.kqv kqvVar5 = i3 == 3 ? (defpackage.kqv) kqxVarB.c : defpackage.kqv.a;
                                                    aooh.e(kqvVar5, "getAddContact(...)");
                                                    java.lang.String str16 = kqvVar5.c;
                                                    aooh.e(str16, "getPhoneNumber(...)");
                                                    if (str16.length() == 0) {
                                                        defpackage.kql.a.d().l("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionValidation", "isAddContactValid", 67, "CallActionValidation.kt").v("Add contact action has no phone number.");
                                                        zMatches = false;
                                                    } else {
                                                        zMatches = defpackage.kql.c.matcher(kqvVar5.c).matches();
                                                    }
                                                }
                                                if (zMatches) {
                                                    kqxVar = kqxVarB;
                                                } else {
                                                    kqxVar = null;
                                                }
                                            } else {
                                                kqxVar = null;
                                            }
                                        }
                                    }
                                    if (kqxVar != null) {
                                        arrayList3.add(kqxVar);
                                    }
                                    str11 = str7;
                                    str12 = str8;
                                    str10 = str5;
                                    str9 = str4;
                                    str13 = str6;
                                }
                                return arrayList3;
                            } catch (j$.time.DateTimeException e7) {
                                e = e7;
                                str4 = str9;
                                str6 = str13;
                            }
                        } catch (java.lang.Exception e8) {
                            e = e8;
                            str4 = str9;
                            str5 = str10;
                        }
                    } catch (j$.time.DateTimeException e9) {
                        e = e9;
                        str2 = "toCallActions";
                        str3 = "CallActionsParser.kt";
                    }
                } catch (akeg e10) {
                    e = e10;
                    b.d().k(e).l("com/android/dialer/callnotesinfra/summarizer/callaction/CallActionsParser", str12, 33, str9).v("Failed to parse actions JSON.");
                    throw new defpackage.kpk(defpackage.kqz.RESPONSE_FORMAT_FAILURE, "Failed to parse actions JSON.", e);
                }
            } catch (java.io.IOException e11) {
                throw new aked(e11);
            } catch (java.lang.NumberFormatException e12) {
                e = e12;
                throw new akei(e);
            } catch (akez e13) {
                e = e13;
                throw new akei(e);
            }
        } catch (akeg e14) {
            e = e14;
            str12 = "toCallActions";
            str9 = "CallActionsParser.kt";
        }
    }
}
