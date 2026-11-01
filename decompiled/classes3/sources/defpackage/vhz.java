package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhz {
    public static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder");
    public final defpackage.vid b;
    public final java.lang.String c;
    public defpackage.vhy d;
    public boolean e;
    private final aoin f;

    public vhz(defpackage.vid vidVar, java.lang.String str, aoin aoinVar) {
        this.b = vidVar;
        this.c = str;
        this.f = aoinVar;
    }

    private final defpackage.vha i(java.io.InputStream inputStream, java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStreamB = defpackage.vhw.b(inputStream, str);
        defpackage.vho vhoVar = new defpackage.vho(this.b.a);
        java.io.OutputStream outputStreamC = vhoVar.c();
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStreamB.read(bArr);
                if (i == -1) {
                    break;
                }
                outputStreamC.write(bArr, 0, i);
            }
        } catch (android.util.Base64DataException unused) {
            outputStreamC.write("\n\nThere was an error while decoding the message.".getBytes());
        } finally {
            outputStreamC.close();
        }
        return vhoVar;
    }

    private static void j(defpackage.vij vijVar, defpackage.vhk vhkVar, java.lang.String str) throws defpackage.vgv {
        int i = 0;
        if (vijVar.f(0).s()) {
            defpackage.vhv vhvVar = new defpackage.vhv();
            int iE = vijVar.e();
            while (i < iE) {
                defpackage.vih vihVarF = vijVar.f(i);
                if (!vihVarF.s()) {
                    if (!vihVarF.t()) {
                        break;
                    }
                    vhvVar.g(vijVar.j(i).b().toLowerCase(java.util.Locale.US));
                    break;
                }
                int i2 = i + 1;
                defpackage.vhq vhqVar = new defpackage.vhq(null);
                if (str.equals("TEXT")) {
                    j(vijVar.h(i), vhqVar, java.lang.Integer.toString(i2));
                } else {
                    j(vijVar.h(i), vhqVar, str + '.' + i2);
                }
                vhvVar.f(vhqVar);
                i = i2;
            }
            vhkVar.o(vhvVar);
            return;
        }
        defpackage.viq viqVarJ = vijVar.j(0);
        int i3 = 1;
        defpackage.viq viqVarJ2 = vijVar.j(1);
        java.lang.String lowerCase = (viqVarJ.b() + '/' + viqVarJ2.b()).toLowerCase(java.util.Locale.US);
        defpackage.vij vijVarH = vijVar.h(2);
        defpackage.viq viqVarJ3 = vijVar.j(3);
        defpackage.viq viqVarJ4 = vijVar.j(5);
        int iD = vijVar.j(6).d(0);
        int i4 = defpackage.vhw.a;
        if (java.util.regex.Pattern.compile("message/rfc822".replaceAll("\\*", "\\.\\*"), 2).matcher(lowerCase).matches()) {
            throw new defpackage.vgv("BODYSTRUCTURE message/rfc822 not yet supported.", null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(lowerCase);
        int iE2 = vijVarH.e();
        int i5 = 1;
        while (i5 < iE2) {
            int i6 = i3;
            java.util.Locale locale = java.util.Locale.US;
            int i7 = i;
            java.lang.String strB = vijVarH.j(i5 - 1).b();
            java.lang.String strB2 = vijVarH.j(i5).b();
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[i7] = strB;
            objArr[i6] = strB2;
            sb.append(java.lang.String.format(locale, ";\n %s=\"%s\"", objArr));
            i5 += 2;
            i3 = i6;
            i = i7;
        }
        int i8 = i;
        int i9 = i3;
        vhkVar.p("Content-Type", sb.toString());
        defpackage.vij vijVarH2 = (viqVarJ.e("TEXT") && vijVar.f(9).s()) ? vijVar.h(9) : vijVar.h(8);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        if (vijVarH2.e() > 0) {
            java.lang.String lowerCase2 = vijVarH2.j(i8).b().toLowerCase(java.util.Locale.US);
            if (!android.text.TextUtils.isEmpty(lowerCase2)) {
                sb2.append(lowerCase2);
            }
            defpackage.vij vijVarH3 = vijVarH2.h(i9);
            if (!vijVarH3.l()) {
                int iE3 = vijVarH3.e();
                for (int i10 = 1; i10 < iE3; i10 += 2) {
                    sb2.append(java.lang.String.format(java.util.Locale.US, ";\n %s=\"%s\"", vijVarH3.j(i10 - 1).b().toLowerCase(java.util.Locale.US), vijVarH3.j(i10).b()));
                }
            }
        }
        if (iD > 0 && defpackage.vhw.c(sb2.toString(), "size") == null) {
            sb2.append(java.lang.String.format(java.util.Locale.US, ";\n size=%d", java.lang.Integer.valueOf(iD)));
        }
        if (sb2.length() > 0) {
            vhkVar.p("Content-Disposition", sb2.toString());
        }
        if (!viqVarJ4.g()) {
            vhkVar.p("Content-Transfer-Encoding", viqVarJ4.b());
        }
        if (!viqVarJ3.g()) {
            vhkVar.p("Content-ID", viqVarJ3.b());
        }
        if (iD > 0) {
            if (vhkVar instanceof defpackage.vic) {
            } else {
                if (!(vhkVar instanceof defpackage.vhq)) {
                    throw new defpackage.vgv("Unknown part type ".concat(vhkVar.toString()), null);
                }
            }
        }
        vhkVar.p("X-Android-Attachment-StoreData", str);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x041a A[LOOP:2: B:59:0x018b->B:150:0x041a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x0415 A[SYNTHETIC] */
    public final aihd a(aihd aihdVar, defpackage.vhd vhdVar) {
        aikn aiknVarH;
        int i;
        defpackage.vhk vhkVar;
        java.lang.String string;
        aec aecVar;
        java.lang.String str;
        java.lang.String str2;
        defpackage.vhk vhkVar2;
        aihb aihbVar;
        byte[] bArr;
        java.lang.String[] strArrQ;
        java.lang.String str3 = "$CNS-Greeting-On";
        c();
        aimz aimzVar = a;
        a.bt(aimzVar.b(), "Fetching UIDs: %s", aihdVar, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", (char) 249, "ImapFolder.java", zct.a);
        if (aihdVar.isEmpty()) {
            aiknVarH = aikn.a;
        } else {
            aihb aihbVar2 = new aihb();
            ailj ailjVarK = aihdVar.k();
            while (ailjVarK.hasNext()) {
                aihbVar2.i(new defpackage.vic(this.b.a, (java.lang.String) ailjVarK.next()));
            }
            aiknVarH = aihbVar2.h();
        }
        if (aiknVarH.isEmpty()) {
            return aikn.a;
        }
        aec acaVar = new aca();
        ailj ailjVarK2 = aiknVarH.k();
        while (ailjVarK2.hasNext()) {
            defpackage.vhi vhiVar = (defpackage.vhi) ailjVarK2.next();
            acaVar.put(vhiVar.a, vhiVar);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add("UID");
        defpackage.vhc vhcVar = defpackage.vhc.a;
        if (vhdVar.contains(vhcVar)) {
            linkedHashSet.add("FLAGS");
        }
        defpackage.vhc vhcVar2 = defpackage.vhc.b;
        java.lang.String str4 = "INTERNALDATE";
        if (vhdVar.contains(vhcVar2)) {
            linkedHashSet.add("INTERNALDATE");
            linkedHashSet.add("RFC822.SIZE");
            linkedHashSet.add("BODY.PEEK[HEADER.FIELDS (date subject from content-type to cc message-id content-duration)]");
        }
        if (vhdVar.contains(defpackage.vhc.c)) {
            linkedHashSet.add("BODYSTRUCTURE");
        }
        if (vhdVar.contains(defpackage.vhc.d)) {
            i = 0;
            linkedHashSet.add(java.lang.String.format(java.util.Locale.US, "BODY.PEEK[]<0.%d>", 128000));
        } else {
            i = 0;
        }
        if (vhdVar.contains(defpackage.vhc.e)) {
            linkedHashSet.add("BODY.PEEK[]");
        }
        int size = vhdVar.size();
        int i2 = i;
        while (true) {
            if (i2 >= size) {
                vhkVar = null;
                break;
            }
            defpackage.vhe vheVar = (defpackage.vhe) vhdVar.get(i2);
            int i3 = size;
            i2++;
            if (vheVar instanceof defpackage.vhk) {
                vhkVar = (defpackage.vhk) vheVar;
                break;
            }
            size = i3;
        }
        if (vhkVar != null && (strArrQ = vhkVar.q("X-Android-Attachment-StoreData")) != null) {
            linkedHashSet.add("BODY.PEEK[" + strArrQ[i] + ']');
        }
        aihb aihbVar3 = new aihb();
        try {
            defpackage.vhy vhyVar = this.d;
            java.util.Locale locale = java.util.Locale.US;
            aihb aihbVar4 = aihbVar3;
            java.lang.String strB = defpackage.vid.b(aiknVarH);
            java.lang.String str5 = "RFC822.SIZE";
            java.lang.String str6 = "BODYSTRUCTURE";
            java.lang.Object[] array = linkedHashSet.toArray(new java.lang.String[i]);
            java.nio.charset.Charset charset = defpackage.vir.a;
            if (array == null) {
                string = null;
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i4 = 0;
                while (true) {
                    int length = array.length;
                    if (i4 >= length) {
                        break;
                    }
                    java.lang.Object[] objArr = array;
                    sb.append(array[i4].toString());
                    if (i4 < length - 1) {
                        sb.append(' ');
                    }
                    i4++;
                    array = objArr;
                }
                string = sb.toString();
            }
            int i5 = 2;
            vhyVar.g(java.lang.String.format(locale, "UID FETCH %s (%s)", strB, string), new defpackage.vih[0]);
            while (true) {
                defpackage.vil vilVarA = this.d.a();
                if (vilVarA.p(1, "FETCH")) {
                    defpackage.vij vijVarH = vilVarA.h(i5);
                    java.lang.String strB2 = vijVarH.i("UID", false).b();
                    if (((java.lang.Boolean) this.f.a()).booleanValue()) {
                        aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 321, "ImapFolder.java").y("IMAP server response UID: %s", strB2);
                    }
                    if (android.text.TextUtils.isEmpty(strB2)) {
                        aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 324, "ImapFolder.java").v("uid is empty");
                    } else {
                        defpackage.vic vicVar = (defpackage.vic) acaVar.get(strB2);
                        if (vicVar == null) {
                            aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 330, "ImapFolder.java").v("No message found for uid attached to fetch response");
                        } else {
                            if (vhdVar.contains(vhcVar)) {
                                defpackage.vij vijVarM = vijVarH.m("FLAGS");
                                int iE = vijVarM.e();
                                int i6 = 0;
                                while (i6 < iE) {
                                    aec aecVar2 = acaVar;
                                    defpackage.viq viqVarJ = vijVarM.j(i6);
                                    defpackage.vij vijVar = vijVarM;
                                    if (viqVarJ.e("\\DELETED")) {
                                        vicVar.u("deleted");
                                    } else if (viqVarJ.e("\\ANSWERED")) {
                                        vicVar.u("answered");
                                    } else if (viqVarJ.e("\\SEEN")) {
                                        vicVar.u("seen");
                                    } else if (viqVarJ.e("\\FLAGGED")) {
                                        vicVar.u("flagged");
                                    } else if (viqVarJ.e(str3)) {
                                        vicVar.u(str3);
                                    }
                                    i6++;
                                    acaVar = aecVar2;
                                    vijVarM = vijVar;
                                }
                            }
                            aecVar = acaVar;
                            if (vhdVar.contains(vhcVar2)) {
                                str2 = str4;
                                defpackage.viq viqVarI = vijVarH.i(str2, false);
                                if (viqVarI.f()) {
                                    java.util.Date date = viqVarI.d;
                                }
                                str = str5;
                                vijVarH.i(str, false).d(0);
                                java.lang.String strB3 = vijVarH.i("BODY[HEADER", true).b();
                                try {
                                    java.nio.charset.Charset charset2 = defpackage.vir.a;
                                    if (strB3 == null) {
                                        bArr = null;
                                    } else {
                                        java.nio.ByteBuffer byteBufferEncode = charset2.encode(java.nio.CharBuffer.wrap(strB3));
                                        bArr = new byte[byteBufferEncode.limit()];
                                        byteBufferEncode.get(bArr);
                                    }
                                    try {
                                        vicVar.t(new java.io.ByteArrayInputStream(bArr));
                                    } catch (java.lang.Exception e) {
                                        e = e;
                                        a.c().i(zct.b).k(e).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 365, "ImapFolder.java").v("Error parsing header");
                                    }
                                } catch (java.lang.Exception e2) {
                                    e = e2;
                                    str3 = str3;
                                }
                            } else {
                                str = str5;
                                str2 = str4;
                                str3 = str3;
                            }
                            if (vhdVar.contains(defpackage.vhc.c)) {
                                java.lang.String str7 = str6;
                                defpackage.vij vijVarM2 = vijVarH.m(str7);
                                if (vijVarM2.l()) {
                                    str6 = str7;
                                } else {
                                    str6 = str7;
                                    a.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 371, "ImapFolder.java").y("BODYSTRUCTURE: %s", vijVarM2);
                                    try {
                                        j(vijVarM2, vicVar, "TEXT");
                                    } catch (defpackage.vgv e3) {
                                        a.c().i(zct.b).k(e3).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 375, "ImapFolder.java").v("Error handling message");
                                        vicVar.o(null);
                                    }
                                }
                            }
                            if (vhdVar.contains(defpackage.vhc.e) || vhdVar.contains(defpackage.vhc.d)) {
                                try {
                                    vicVar.t(vijVarH.i("BODY[]", true).a());
                                } catch (java.lang.Exception e4) {
                                    a.c().i(zct.b).k(e4).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 389, "ImapFolder.java").v("Error parsing body");
                                }
                            }
                            if (vhkVar != null) {
                                java.io.InputStream inputStreamA = vijVarH.i("BODY[", true).a();
                                vhkVar2 = vhkVar;
                                java.lang.String[] strArrQ2 = vhkVar2.q("Content-Transfer-Encoding");
                                try {
                                    vicVar.o(i(inputStreamA, (strArrQ2 == null || strArrQ2.length <= 0) ? "7bit" : strArrQ2[0]));
                                } catch (java.lang.Exception e5) {
                                    a.c().i(zct.b).k(e5).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 417, "ImapFolder.java").v("Error fetching body");
                                }
                            } else {
                                vhkVar2 = vhkVar;
                            }
                            aihbVar = aihbVar4;
                            aihbVar.i(vicVar);
                        }
                        if (vilVarA.r()) {
                            return aihbVar.h();
                        }
                        aihbVar4 = aihbVar;
                        str5 = str;
                        vhkVar = vhkVar2;
                        str3 = str3;
                        acaVar = aecVar;
                        i5 = 2;
                        str4 = str2;
                    }
                } else {
                    aimzVar.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "fetch", 315, "ImapFolder.java").y("not data response, already tagged: %b", java.lang.Boolean.valueOf(vilVarA.r()));
                }
                vilVarA = vilVarA;
                aecVar = acaVar;
                vhkVar2 = vhkVar;
                str = str5;
                str2 = str4;
                str3 = str3;
                aihbVar = aihbVar4;
                if (vilVarA.r()) {
                    return aihbVar.h();
                }
                aihbVar4 = aihbVar;
                str5 = str;
                vhkVar = vhkVar2;
                str3 = str3;
                acaVar = aecVar;
                i5 = 2;
                str4 = str2;
            }
        } catch (java.io.IOException e6) {
            f(this.d);
            throw new defpackage.vcx(e6.getMessage(), defpackage.vbw.NETWORK_CONNECTION_GENERIC_IMAP_IOE);
        }
    }

    public final aihd b(java.lang.String str) throws defpackage.vgv {
        c();
        try {
            java.util.List<defpackage.vil> listC = this.d.c(a.bx(str, "UID SEARCH "));
            aihb aihbVar = new aihb();
            for (defpackage.vil vilVar : listC) {
                if (vilVar.p(0, "SEARCH")) {
                    for (int i = 1; i < vilVar.e(); i++) {
                        aihbVar.i(vilVar.j(i).b());
                    }
                }
            }
            return aihbVar.h();
        } catch (java.io.IOException e) {
            f(this.d);
            throw new defpackage.vcx(e.getMessage(), defpackage.vbw.NETWORK_CONNECTION_GENERIC_IMAP_IOE);
        } catch (defpackage.vib e2) {
            hgb.g(a.c(), "ImapException in search: %s", str, "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "searchForUids", (char) 195, "ImapFolder.java", e2, zct.b);
            return aikn.a;
        }
    }

    public final void c() throws defpackage.vgv {
        if (e()) {
            return;
        }
        throw new defpackage.vgv("Folder " + this.c + " is not open.", null);
    }

    public final void d(boolean z) {
        if (z) {
            try {
                c();
                try {
                    for (defpackage.vil vilVar : this.d.c("EXPUNGE")) {
                        if (vilVar.p(1, "EXISTS")) {
                            vilVar.j(0).d(0);
                        }
                    }
                } catch (java.io.IOException e) {
                    f(this.d);
                    throw new defpackage.vcx(e.getMessage(), defpackage.vbw.NETWORK_CONNECTION_GENERIC_IMAP_IOE);
                }
            } catch (defpackage.vgv e2) {
                a.bq(a.c(), "Messaging Exception", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/ImapFolder", "close", (char) 154, "ImapFolder.java", e2, zct.b);
            }
        }
        synchronized (this) {
            this.d = null;
        }
    }

    public final boolean e() {
        return this.e && this.d != null;
    }

    public final void f(defpackage.vhy vhyVar) {
        vhyVar.e();
        if (vhyVar == this.d) {
            this.d = null;
            d(false);
        }
    }

    public final void g(aihd aihdVar, aihd aihdVar2) throws defpackage.vgv {
        java.lang.String strSubstring;
        c();
        if (aihdVar2.isEmpty()) {
            strSubstring = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            ailj ailjVarK = aihdVar2.k();
            while (ailjVarK.hasNext()) {
                java.lang.String str = (java.lang.String) ailjVarK.next();
                if ("seen".equals(str)) {
                    sb.append(" \\SEEN");
                } else if ("deleted".equals(str)) {
                    sb.append(" \\DELETED");
                } else if ("flagged".equals(str)) {
                    sb.append(" \\FLAGGED");
                } else if ("answered".equals(str)) {
                    sb.append(" \\ANSWERED");
                }
            }
            strSubstring = sb.substring(1);
        }
        try {
            this.d.c(java.lang.String.format(java.util.Locale.US, "UID STORE %s %sFLAGS.SILENT (%s)", defpackage.vid.b(aihdVar), "+", strSubstring));
        } catch (java.io.IOException e) {
            f(this.d);
            throw new defpackage.vcx(e.getMessage(), defpackage.vbw.NETWORK_CONNECTION_GENERIC_IMAP_IOE);
        }
    }

    public final defpackage.vtl h() {
        try {
            for (defpackage.vil vilVar : this.d.c(java.lang.String.format(java.util.Locale.US, "GETQUOTAROOT \"%s\"", this.c))) {
                if (vilVar.p(0, "QUOTA")) {
                    defpackage.vij vijVarH = vilVar.h(2);
                    for (int i = 0; i < vijVarH.e(); i += 3) {
                        if (vijVarH.j(i).e("voice") || vijVarH.j(i).e("voice-message") || vijVarH.j(i).e("MESSAGE")) {
                            return new defpackage.vtl(vijVarH.j(i + 1).d(-1), vijVarH.j(i + 2).d(-1), null);
                        }
                    }
                }
            }
            return null;
        } catch (java.io.IOException e) {
            f(this.d);
            throw new defpackage.vcx(e.getMessage(), defpackage.vbw.NETWORK_CONNECTION_GENERIC_IMAP_IOE);
        }
    }
}
