package com.android.dialer.dialpadview;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class DialpadView extends android.widget.LinearLayout {
    public static final /* synthetic */ int f = 0;
    public android.widget.EditText b;
    public android.widget.ImageButton c;
    public android.view.View d;
    public boolean e;
    private final java.lang.String[] i;
    private final java.lang.String[] j;
    private final boolean k;
    private final int l;
    private static final aimz g = aimz.i("com/android/dialer/dialpadview/DialpadView");
    static final int[] a = {2131429546, 2131428622, 2131429326, 2131429260, 2131428298, 2131428279, 2131428958, 2131428934, 2131428083, 2131428583, 2131429014, 2131428713};
    private static final int[] h = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 11};

    public DialpadView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundColor(urg.c(getContext(), 2130969107));
        this.l = getResources().getDimensionPixelSize(2131165623);
        this.k = android.text.TextUtils.getLayoutDirectionFromLocale(java.util.Locale.getDefault()) == 1;
        aec aecVar = defpackage.mip.a;
        this.i = defpackage.mim.a;
        this.j = (java.lang.String[]) defpackage.mip.b.get(gus.ae(context).getISO3Language());
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0172  */
    /* JADX WARN: Code duplicated, block: B:120:0x0175  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x00de  */
    public final void a() {
        int i;
        int i2;
        defpackage.mis misVar = new defpackage.mis(this);
        for (int i3 = 0; i3 < 12; i3++) {
            int[] iArr = a;
            int i4 = iArr[i3];
            if (this.e) {
                if (this.k) {
                    if (i4 == 2131429260) {
                        i = 33;
                    } else if (i4 == 2131428958) {
                        i = 66;
                    } else if (i4 == 2131428583) {
                        i = 99;
                    } else if (i4 == 2131428713) {
                        i = 132;
                    } else if (i4 == 2131429326) {
                        i = 165;
                    } else if (i4 == 2131428279) {
                        i = 198;
                    } else if (i4 == 2131428083) {
                        i = 231;
                    } else if (i4 == 2131429546) {
                        i = 264;
                    } else if (i4 == 2131428622) {
                        i = 297;
                    } else if (i4 == 2131428298) {
                        i = 330;
                    } else if (i4 == 2131428934 || i4 == 2131429014) {
                        i = 363;
                    } else {
                        a.bI(g.c().m(aioa.b), "Attempted to get animation delay for invalid key button id.", "com/android/dialer/dialpadview/DialpadView", "getKeyButtonAnimationDelay", (char) 449, "DialpadView.java", zct.b);
                        i = 0;
                    }
                } else if (i4 == 2131428622) {
                    i = 33;
                } else if (i4 == 2131428298) {
                    i = 66;
                } else if (i4 == 2131428934) {
                    i = 99;
                } else if (i4 == 2131429014) {
                    i = 132;
                } else if (i4 == 2131429326) {
                    i = 165;
                } else if (i4 == 2131428279) {
                    i = 198;
                } else if (i4 == 2131428083) {
                    i = 231;
                } else if (i4 == 2131429546) {
                    i = 264;
                } else if (i4 == 2131429260) {
                    i = 297;
                } else if (i4 == 2131428958) {
                    i = 330;
                } else if (i4 == 2131428583 || i4 == 2131428713) {
                    i = 363;
                } else {
                    a.bI(g.c().m(aioa.b), "Attempted to get animation delay for invalid key button id.", "com/android/dialer/dialpadview/DialpadView", "getKeyButtonAnimationDelay", (char) 449, "DialpadView.java", zct.b);
                    i = 0;
                }
            } else if (i4 == 2131428622) {
                i = 33;
            } else if (i4 == 2131429326) {
                i = 66;
            } else if (i4 == 2131429260) {
                i = 99;
            } else if (i4 == 2131428298) {
                i = 132;
            } else if (i4 == 2131428279) {
                i = 165;
            } else if (i4 == 2131428958) {
                i = 198;
            } else if (i4 == 2131428934) {
                i = 231;
            } else if (i4 == 2131428083) {
                i = 264;
            } else if (i4 == 2131428583) {
                i = 297;
            } else if (i4 == 2131429014) {
                i = 330;
            } else if (i4 == 2131429546 || i4 == 2131428713) {
                i = 363;
            } else {
                a.bI(g.c().m(aioa.b), "Attempted to get animation delay for invalid key button id.", "com/android/dialer/dialpadview/DialpadView", "getKeyButtonAnimationDelay", (char) 449, "DialpadView.java", zct.b);
                i = 0;
            }
            int i5 = iArr[i3];
            if (this.e) {
                if (this.k) {
                    if (i5 == 2131428622 || i5 == 2131428298 || i5 == 2131428934 || i5 == 2131429014) {
                        i2 = 264;
                    } else if (i5 == 2131429326 || i5 == 2131428279 || i5 == 2131428083 || i5 == 2131429546) {
                        i2 = 297;
                    } else if (i5 == 2131429260 || i5 == 2131428958 || i5 == 2131428583 || i5 == 2131428713) {
                        i2 = 330;
                    } else {
                        a.bI(g.c().m(aioa.b), "Attempted to get animation duration for invalid key button id.", "com/android/dialer/dialpadview/DialpadView", "getKeyButtonAnimationDuration", (char) 516, "DialpadView.java", zct.b);
                        i2 = 0;
                    }
                } else if (i5 == 2131428622 || i5 == 2131428298 || i5 == 2131428934 || i5 == 2131429014) {
                    i2 = 330;
                } else if (i5 == 2131429326 || i5 == 2131428279 || i5 == 2131428083 || i5 == 2131429546) {
                    i2 = 297;
                } else if (i5 == 2131429260 || i5 == 2131428958 || i5 == 2131428583 || i5 == 2131428713) {
                    i2 = 264;
                } else {
                    a.bI(g.c().m(aioa.b), "Attempted to get animation duration for invalid key button id.", "com/android/dialer/dialpadview/DialpadView", "getKeyButtonAnimationDuration", (char) 516, "DialpadView.java", zct.b);
                    i2 = 0;
                }
            } else if (i5 == 2131428622 || i5 == 2131429326 || i5 == 2131429260 || i5 == 2131428298 || i5 == 2131428279 || i5 == 2131428958) {
                i2 = 330;
            } else if (i5 == 2131428934 || i5 == 2131428083 || i5 == 2131428583) {
                i2 = 297;
            } else if (i5 == 2131429014 || i5 == 2131429546 || i5 == 2131428713) {
                i2 = 264;
            } else {
                a.bI(g.c().m(aioa.b), "Attempted to get animation duration for invalid key button id.", "com/android/dialer/dialpadview/DialpadView", "getKeyButtonAnimationDuration", (char) 516, "DialpadView.java", zct.b);
                i2 = 0;
            }
            android.view.View viewFindViewById = findViewById(iArr[i3]);
            android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = viewFindViewById.animate();
            if (this.e) {
                viewFindViewById.setTranslationX((true != this.k ? 1 : -1) * this.l);
                viewPropertyAnimatorAnimate.translationX(0.0f);
            } else {
                viewFindViewById.setTranslationY(this.l);
                viewPropertyAnimatorAnimate.translationY(0.0f);
            }
            viewPropertyAnimatorAnimate.setInterpolator(defpackage.hrm.c).setStartDelay((int) (((double) i) * 0.66d)).setDuration((int) (((double) i2) * 0.8d)).setListener(misVar).start();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6 A[SYNTHETIC] */
    @Override // android.view.View
    protected final void onFinishInflate() {
        java.lang.String string;
        java.lang.CharSequence charSequence;
        int i;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence text;
        super.onFinishInflate();
        this.e = getResources().getBoolean(2131034122);
        android.content.res.Resources resources = getContext().getResources();
        java.util.Locale localeAe = gus.ae(getContext());
        java.text.NumberFormat decimalFormat = "fas".equals(localeAe.getISO3Language()) ? java.text.DecimalFormat.getInstance(localeAe) : java.text.DecimalFormat.getInstance(java.util.Locale.ENGLISH);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < 12; i2++) {
            int[] iArr = a;
            int i3 = iArr[i2];
            if (i3 == 2131428713) {
                string = resources.getString(2132018324);
            } else if (i3 == 2131429014) {
                string = resources.getString(2132018325);
            } else {
                long j = i2;
                if (i3 == 2131429546) {
                    string = decimalFormat.format(j);
                } else {
                    string = decimalFormat.format(j);
                    java.lang.String str = this.i[i2];
                    android.text.Spannable spannableNewSpannable = android.text.Spannable.Factory.getInstance().newSpannable(a.bE(str, (byte) 44, string));
                    spannableNewSpannable.setSpan(new android.text.style.TtsSpan.CardinalBuilder(string).build(), 0, string.length(), 33);
                    spannableNewSpannable.setSpan(new android.text.style.TtsSpan.VerbatimBuilder(str).build(), string.length() + 1, string.length() + 1 + str.length(), 33);
                    charSequence = spannableNewSpannable;
                }
                i = iArr[i2];
                if (i == 2131428622) {
                    text = resources.getText(2132018283);
                } else {
                    if (i == 2131429546) {
                        text = resources.getText(2132018257);
                    } else {
                        charSequence2 = null;
                    }
                    java.lang.String str2 = this.i[i2];
                    java.lang.String[] strArr = this.j;
                    java.lang.String str3 = strArr != null ? strArr[i2] : null;
                    if (true == string.equals("*")) {
                        string = "∗";
                    }
                    arrayList.add(new abpo(string, str2, str3, charSequence, charSequence2));
                }
                charSequence2 = text;
                java.lang.String str4 = this.i[i2];
                java.lang.String[] strArr2 = this.j;
                java.lang.String str5 = strArr2 != null ? strArr2[i2] : null;
                if (true == string.equals("*")) {
                    string = "∗";
                }
                arrayList.add(new abpo(string, str4, str5, charSequence, charSequence2));
            }
            charSequence = string;
            i = iArr[i2];
            if (i == 2131428622) {
                text = resources.getText(2132018283);
            } else {
                if (i == 2131429546) {
                    text = resources.getText(2132018257);
                } else {
                    charSequence2 = null;
                }
                java.lang.String str6 = this.i[i2];
                java.lang.String[] strArr3 = this.j;
                java.lang.String str7 = strArr3 != null ? strArr3[i2] : null;
                if (true == string.equals("*")) {
                    string = "∗";
                }
                arrayList.add(new abpo(string, str6, str7, charSequence, charSequence2));
            }
            charSequence2 = text;
            java.lang.String str8 = this.i[i2];
            java.lang.String[] strArr4 = this.j;
            java.lang.String str9 = strArr4 != null ? strArr4[i2] : null;
            if (true == string.equals("*")) {
                string = "∗";
            }
            arrayList.add(new abpo(string, str8, str9, charSequence, charSequence2));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int[] iArr2 = h;
        for (int i4 = 0; i4 < 12; i4++) {
            arrayList2.add((abpo) arrayList.get(iArr2[i4]));
        }
        com.google.android.libraries.communications.ux.views.dialpad.Dialpad dialpadFindViewById = findViewById(2131427991);
        if (dialpadFindViewById instanceof com.google.android.libraries.communications.ux.views.dialpad.Dialpad) {
            com.google.android.libraries.communications.ux.views.dialpad.Dialpad dialpad = dialpadFindViewById;
            abpn abpnVar = new abpn(arrayList2);
            if (!aooh.n(dialpad.c, abpnVar)) {
                dialpad.c = abpnVar;
                android.util.Size size = dialpad.b;
                if (size != null) {
                    dialpad.a = size;
                    dialpad.a(abpnVar, size);
                }
            }
        }
        this.b = (android.widget.EditText) findViewById(2131428000);
        this.c = (android.widget.ImageButton) findViewById(2131427936);
        this.d = findViewById(2131427988);
        if (((android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            this.b.setSelected(true);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public DialpadView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialpadView(android.content.Context context) {
        this(context, null);
    }
}
