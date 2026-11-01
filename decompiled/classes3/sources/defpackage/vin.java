package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vin {
    private static final aimz a = aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapResponseParser");
    private final defpackage.vhl b;
    private final java.lang.StringBuilder c = new java.lang.StringBuilder();
    private final java.lang.StringBuilder d = new java.lang.StringBuilder();

    public vin(java.io.InputStream inputStream) {
        this.b = new defpackage.vhl(inputStream);
    }

    private final int e() throws java.io.IOException {
        defpackage.vhl vhlVar = this.b;
        if (!vhlVar.a) {
            vhlVar.b = vhlVar.read();
            vhlVar.a = true;
        }
        int i = vhlVar.b;
        if (i != -1) {
            return i;
        }
        throw new java.io.IOException("End of stream reached");
    }

    private final int f() throws java.io.IOException {
        int i = this.b.read();
        if (i != -1) {
            return i;
        }
        throw new java.io.IOException("End of stream reached");
    }

    private final defpackage.vij g(char c, char c2) throws defpackage.vgv, java.io.IOException {
        d(c);
        defpackage.vij vijVar = new defpackage.vij();
        k(vijVar, c2);
        d(c2);
        return vijVar;
    }

    private final defpackage.viq h() throws defpackage.vgv, java.io.IOException {
        java.lang.StringBuilder sb = this.d;
        sb.setLength(0);
        while (true) {
            int iE = e();
            if (iE == 40 || iE == 41 || iE == 123 || iE == 32 || iE == 93 || iE == 37 || iE == 34 || ((iE >= 0 && iE <= 31) || iE == 127)) {
                break;
            }
            if (iE == 91) {
                sb.append((char) f());
                sb.append(b(']'));
                sb.append(']');
            } else {
                sb.append((char) f());
            }
        }
        if (sb.length() == 0) {
            throw new defpackage.vgv("Expected string, none found.", null);
        }
        java.lang.String string = sb.toString();
        return "NIL".equalsIgnoreCase(string) ? defpackage.viq.c : new defpackage.vio(string);
    }

    private final defpackage.viq i() throws defpackage.vgv, java.io.IOException {
        d('{');
        try {
            int i = java.lang.Integer.parseInt(b('}'));
            if (i < 0) {
                throw new defpackage.vgv("Invalid negative length in literal", null);
            }
            d('\r');
            d('\n');
            return new defpackage.vik(new defpackage.vhf(this.b, i));
        } catch (java.lang.NumberFormatException e) {
            throw new defpackage.vgv("Invalid length in literal", e);
        }
    }

    private final void j(java.lang.Exception exc) {
        for (int i = 0; i < 4; i++) {
            try {
                int iF = f();
                if (iF == -1 || iF == 10) {
                    break;
                }
            } catch (java.io.IOException unused) {
            }
        }
        a.bq(a.d(), "Exception detected", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapResponseParser", "onParseError", (char) 144, "ImapResponseParser.java", exc, zct.b);
    }

    private final void k(defpackage.vij vijVar, char c) throws defpackage.vgv, java.io.IOException {
        while (true) {
            int iE = e();
            if (iE == c) {
                return;
            }
            if (iE != 32) {
                int iE2 = e();
                defpackage.vih vioVar = null;
                if (iE2 == 10) {
                    f();
                } else if (iE2 == 13) {
                    f();
                    d('\n');
                } else if (iE2 == 34) {
                    f();
                    vioVar = new defpackage.vio(b('\"'));
                } else if (iE2 == 40) {
                    vioVar = g('(', ')');
                } else if (iE2 == 91) {
                    vioVar = g('[', ']');
                } else if (iE2 == 123) {
                    vioVar = i();
                } else if (iE2 != 126) {
                    vioVar = h();
                } else {
                    f();
                    vioVar = i();
                }
                if (vioVar == null) {
                    return;
                } else {
                    vijVar.d(vioVar);
                }
            } else {
                f();
            }
        }
    }

    public final defpackage.vil a(boolean z) throws java.lang.Exception {
        defpackage.vil vilVar;
        try {
            int iE = e();
            java.lang.String strB = null;
            if (iE == 43) {
                f();
                a.b().l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapResponseParser", "parseResponse", 215, "ImapResponseParser.java").v("continuation request detected, skipping rest of line");
                vilVar = new defpackage.vil(null, true);
                vilVar.d(new defpackage.vio(c()));
            } else {
                if (iE == 42) {
                    f();
                    int iE2 = e();
                    if (iE2 != 32) {
                        throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, "Expected at least one %04x (%c) but next is %04x (%c)", 32, ' ', java.lang.Integer.valueOf(iE2), java.lang.Character.valueOf((char) iE2)));
                    }
                    while (e() == 32) {
                        f();
                    }
                } else {
                    strB = b(' ');
                }
                vilVar = new defpackage.vil(strB, false);
                vilVar.d(h());
                if (e() == 32) {
                    f();
                    if (vilVar.q()) {
                        if (e() == 91) {
                            vilVar.d(g('[', ']'));
                            if (e() == 32) {
                                f();
                            }
                        }
                        java.lang.String strC = c();
                        if (!android.text.TextUtils.isEmpty(strC)) {
                            vilVar.d(new defpackage.vio(strC));
                        }
                    } else {
                        k(vilVar, (char) 0);
                    }
                } else {
                    d('\r');
                    d('\n');
                }
            }
            if (z || !vilVar.k(0, "BYE", false)) {
                return vilVar;
            }
            a.bI(a.d(), "Received BYE", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/imap/mail/store/imap/ImapResponseParser", "readResponse", 'z', "ImapResponseParser.java", zct.b);
            throw new defpackage.vim();
        } catch (java.io.IOException e) {
            j(e);
            throw e;
        } catch (java.lang.RuntimeException e2) {
            j(e2);
            throw e2;
        }
    }

    final java.lang.String b(char c) throws java.io.IOException {
        java.lang.StringBuilder sb = this.c;
        sb.setLength(0);
        while (true) {
            int iF = f();
            if (iF == c) {
                return sb.toString();
            }
            sb.append((char) iF);
        }
    }

    final java.lang.String c() throws java.io.IOException {
        java.lang.String strB = b('\r');
        d('\n');
        return strB;
    }

    final void d(char c) throws java.io.IOException {
        int iF = f();
        if (c != iF) {
            throw new java.io.IOException(java.lang.String.format(java.util.Locale.US, "Expected %04x (%c) but got %04x (%c)", java.lang.Integer.valueOf(c), java.lang.Character.valueOf(c), java.lang.Integer.valueOf(iF), java.lang.Character.valueOf((char) iF)));
        }
    }
}
