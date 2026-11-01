package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abve extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;
    final /* synthetic */ java.lang.Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abve(abvh abvhVar, android.net.Uri uri, defpackage.afaw afawVar, defpackage.abuc abucVar, defpackage.abup abupVar, defpackage.amjp amjpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = abvhVar;
        this.c = uri;
        this.d = afawVar;
        this.e = abucVar;
        this.f = abupVar;
        this.g = amjpVar;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [abut, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object abubVar;
        java.lang.String str;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    java.lang.Object obj2 = this.b;
                    java.lang.Object obj3 = this.c;
                    java.lang.Object obj4 = this.d;
                    java.lang.Object obj5 = this.e;
                    defpackage.abup abupVar = (defpackage.abup) this.f;
                    defpackage.abuc abucVar = (defpackage.abuc) obj5;
                    defpackage.afaw afawVar = (defpackage.afaw) obj4;
                    defpackage.abvd abvdVar = new defpackage.abvd((abvh) obj2, (android.net.Uri) obj3, afawVar, abucVar, abupVar, (defpackage.amjp) this.g, null);
                    this.a = 1;
                    obj = aooh.K(5000L, abvdVar, this);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                }
                return (defpackage.abuo) obj;
            } catch (aovk e) {
                abubVar = new defpackage.abub(e);
            } catch (java.io.FileNotFoundException e2) {
                abubVar = new defpackage.abub(e2);
            } catch (java.util.concurrent.CancellationException e3) {
                abubVar = new defpackage.abub(e3);
            } catch (aacw e4) {
                abubVar = new defpackage.abub(e4);
            }
        } else {
            if (i == 1) {
                aolu aoluVar2 = aolu.a;
                int i2 = this.a;
                aooc.af(obj);
                if (i2 == 0) {
                    java.lang.Object obj6 = this.c;
                    ?? r1 = this.g;
                    java.lang.Object obj7 = this.e;
                    java.lang.Object obj8 = this.d;
                    java.lang.Object obj9 = this.b;
                    this.a = 1;
                    aosc aoscVar = new aosc(ajsz.ap(this), 1);
                    aoscVar.z();
                    java.io.File file = (java.io.File) obj8;
                    java.lang.String absolutePath = file.getAbsolutePath();
                    aooh.e(absolutePath, "getAbsolutePath(...)");
                    android.speech.tts.TextToSpeech textToSpeech = (android.speech.tts.TextToSpeech) obj6;
                    textToSpeech.setOnUtteranceProgressListener(new defpackage.uxj(textToSpeech, aoscVar, absolutePath, (akzx) obj9));
                    android.os.Bundle bundle = new android.os.Bundle();
                    defpackage.uwu uwuVar = (defpackage.uwu) obj7;
                    int iAb = a.ab(uwuVar.f);
                    if (iAb == 0) {
                        iAb = 1;
                    }
                    int i3 = iAb - 2;
                    if (i3 == 1) {
                        str = "LocalOnly";
                    } else if (i3 == 2) {
                        str = "LocalFirst";
                    } else if (i3 == 3) {
                        str = "NetworkOnly";
                    } else {
                        if (i3 != 4) {
                            throw new java.lang.IllegalStateException("Invalid Network Mode");
                        }
                        str = "NetworkFirst";
                    }
                    bundle.putString("com.google.android.tts:Mode", str);
                    bundle.putString("com.google.android.tts:DisableVoiceSelectionFallback", java.lang.String.valueOf(uwuVar.d));
                    bundle.putString("com.google.android.tts:DisableInterLanguageFallback", java.lang.String.valueOf(uwuVar.d));
                    bundle.putString("com.google.android.tts:UseGoogleOnlyVoice", "hol");
                    java.lang.String name = file.getName();
                    aooh.e(name, "getName(...)");
                    if (textToSpeech.synthesizeToFile((java.lang.CharSequence) r1, bundle, file, aoov.V(name, name)) != 0) {
                        throw new java.lang.IllegalStateException("tts synthesis failed.");
                    }
                    defpackage.uxk.a.b().l("com/android/dialer/tts/internal/synthesis/TtsFileProvider", "synthesizeTextIntoFile$<anonymous>", 163, "TtsFileProvider.kt").y("attempting to generate: %s", absolutePath);
                    java.lang.Object objK = aoscVar.k();
                    if (objK != aoluVar2) {
                        objK = aojh.a;
                    }
                    if (objK == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return aojh.a;
            }
            aolu aoluVar3 = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                } else {
                    aooc.af(obj);
                    java.lang.Object obj10 = this.f;
                    java.lang.Object obj11 = this.c;
                    java.lang.Object obj12 = this.b;
                    ?? r8 = this.e;
                    defpackage.amjp amjpVar = (defpackage.amjp) this.d;
                    defpackage.afaw afawVar2 = (defpackage.afaw) obj12;
                    defpackage.abvo abvoVar = new defpackage.abvo((abvp) obj10, (android.net.Uri) obj11, afawVar2, r8, amjpVar, (java.lang.String) this.g, null);
                    this.a = 1;
                    obj = aooh.K(5000L, abvoVar, this);
                    if (obj == aoluVar3) {
                        return aoluVar3;
                    }
                }
                return (defpackage.abuo) obj;
            } catch (java.lang.IllegalStateException e5) {
                abubVar = new defpackage.abui(defpackage.abuf.v, e5);
            } catch (aovk e6) {
                abubVar = new defpackage.abui(defpackage.abuf.s, e6);
            } catch (java.io.FileNotFoundException e7) {
                abubVar = new defpackage.abui(defpackage.abuf.u, e7);
            } catch (aacw e8) {
                abubVar = new defpackage.abui(defpackage.abuf.m, e8);
            }
        }
        return abubVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [abut, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.abve abveVar;
        int i = this.$cid;
        if (i != 0) {
            java.lang.Object obj2 = this.f;
            if (i != 1) {
                java.lang.Object obj3 = this.c;
                java.lang.Object obj4 = this.b;
                return new defpackage.abve((abvp) obj2, (android.net.Uri) obj3, (defpackage.afaw) obj4, (defpackage.abut) this.e, (defpackage.amjp) this.d, (java.lang.String) this.g, aolnVar, 2);
            }
            java.lang.Object obj5 = this.c;
            ?? r4 = this.g;
            java.lang.Object obj6 = this.e;
            defpackage.uwu uwuVar = (defpackage.uwu) obj6;
            android.speech.tts.TextToSpeech textToSpeech = (android.speech.tts.TextToSpeech) obj5;
            defpackage.uxk uxkVar = (defpackage.uxk) obj2;
            abveVar = new defpackage.abve(uxkVar, textToSpeech, (java.lang.CharSequence) r4, uwuVar, (java.io.File) this.d, (akzx) this.b, aolnVar, 1);
        } else {
            java.lang.Object obj7 = this.b;
            java.lang.Object obj8 = this.c;
            java.lang.Object obj9 = this.d;
            java.lang.Object obj10 = this.e;
            defpackage.abup abupVar = (defpackage.abup) this.f;
            defpackage.afaw afawVar = (defpackage.afaw) obj9;
            android.net.Uri uri = (android.net.Uri) obj8;
            abvh abvhVar = (abvh) obj7;
            abveVar = new defpackage.abve(abvhVar, uri, afawVar, (defpackage.abuc) obj10, abupVar, (defpackage.amjp) this.g, aolnVar, 0);
        }
        return abveVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abve(abvp abvpVar, android.net.Uri uri, defpackage.afaw afawVar, defpackage.abut abutVar, defpackage.amjp amjpVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.f = abvpVar;
        this.c = uri;
        this.b = afawVar;
        this.e = abutVar;
        this.d = amjpVar;
        this.g = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abve(defpackage.uxk uxkVar, android.speech.tts.TextToSpeech textToSpeech, java.lang.CharSequence charSequence, defpackage.uwu uwuVar, java.io.File file, akzx akzxVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.f = uxkVar;
        this.c = textToSpeech;
        this.g = charSequence;
        this.e = uwuVar;
        this.d = file;
        this.b = akzxVar;
    }
}
