package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afza {
    public final android.content.res.ColorStateList a;
    public final java.lang.String b;
    public java.lang.String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public android.content.res.ColorStateList k;
    public float l;
    public android.graphics.Typeface m;
    private final int n;
    private boolean o = false;
    private boolean p = false;

    public afza(android.content.Context context, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, ef.x);
        this.l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.k = agab.o(context, typedArrayObtainStyledAttributes, 3);
        agab.o(context, typedArrayObtainStyledAttributes, 4);
        agab.o(context, typedArrayObtainStyledAttributes, 5);
        this.d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iM = agab.m(typedArrayObtainStyledAttributes, 12, 10);
        this.n = typedArrayObtainStyledAttributes.getResourceId(iM, 0);
        this.b = typedArrayObtainStyledAttributes.getString(iM);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = agab.o(context, typedArrayObtainStyledAttributes, 6);
        this.f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, afyx.a);
        this.i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.c = typedArrayObtainStyledAttributes2.getString(agab.m(typedArrayObtainStyledAttributes2, 3, 1));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void g() {
        android.graphics.Typeface typeface;
        java.lang.String str;
        android.graphics.Typeface typefaceCreate = this.m;
        if (typefaceCreate == null && (str = this.b) != null) {
            typefaceCreate = android.graphics.Typeface.create(str, this.d);
            this.m = typefaceCreate;
        }
        if (typefaceCreate == null) {
            int i = this.e;
            if (i == 1) {
                typeface = android.graphics.Typeface.SANS_SERIF;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        typeface = android.graphics.Typeface.DEFAULT;
                        this.m = typeface;
                    } else {
                        typeface = android.graphics.Typeface.MONOSPACE;
                    }
                    this.m = android.graphics.Typeface.create(typeface, this.d);
                }
                typeface = android.graphics.Typeface.SERIF;
            }
            this.m = typeface;
            this.m = android.graphics.Typeface.create(typeface, this.d);
        }
    }

    private final boolean h(android.content.Context context) {
        android.content.Context context2;
        android.graphics.Typeface typefaceD;
        java.lang.String string;
        android.graphics.Typeface typefaceCreate;
        if (this.o) {
            return true;
        }
        int i = this.n;
        if (i != 0) {
            int i2 = dwk.a;
            android.graphics.Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceD = null;
            } else {
                context2 = context;
                typefaceD = dwk.d(context2, i, new android.util.TypedValue(), 0, (dwj) null, false, true);
            }
            if (typefaceD == null) {
                if (!this.p) {
                    this.p = true;
                    android.content.res.Resources resources = context2.getResources();
                    if (i == 0 || !resources.getResourceTypeName(i).equals("font")) {
                        string = null;
                        break;
                    }
                    try {
                        android.content.res.XmlResourceParser xml = resources.getXml(i);
                        while (true) {
                            if (xml.getEventType() == 1) {
                                string = null;
                                break;
                            }
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xml), dur.b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                            string = null;
                            break;
                        }
                    } catch (java.lang.Throwable unused) {
                    }
                    if (string != null && (typefaceCreate = android.graphics.Typeface.create(string, 0)) != android.graphics.Typeface.DEFAULT) {
                        typefaceCreate2 = android.graphics.Typeface.create(typefaceCreate, this.d);
                    }
                }
                if (typefaceCreate2 != null) {
                    typefaceD = typefaceCreate2;
                }
            }
            this.m = typefaceD;
            this.o = true;
            return true;
        }
        return false;
    }

    public final android.graphics.Typeface a() {
        g();
        return this.m;
    }

    public final void b(android.content.Context context, defpackage.afzb afzbVar) {
        if (!h(context)) {
            g();
        }
        int i = this.n;
        if (i == 0) {
            this.o = true;
            i = 0;
        }
        if (this.o) {
            afzbVar.b(this.m, true);
            return;
        }
        try {
            dwk.c(context, i, new defpackage.afyy(this, afzbVar));
        } catch (android.content.res.Resources.NotFoundException unused) {
            this.o = true;
            afzbVar.a(1);
        } catch (java.lang.Exception e) {
            android.util.Log.d("TextAppearance", "Error loading font ".concat(java.lang.String.valueOf(this.b)), e);
            this.o = true;
            afzbVar.a(-3);
        }
    }

    public final void c(android.content.Context context, android.text.TextPaint textPaint, defpackage.afzb afzbVar) {
        d(context, textPaint, afzbVar);
        android.content.res.ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.k.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        android.content.res.ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(android.content.Context context, android.text.TextPaint textPaint, defpackage.afzb afzbVar) {
        android.graphics.Typeface typeface;
        if (h(context) && this.o && (typeface = this.m) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new defpackage.afyz(this, context, textPaint, afzbVar));
        }
    }

    public final void e(android.content.Context context, android.text.TextPaint textPaint, android.graphics.Typeface typeface) {
        android.graphics.Typeface typefaceJ = defpackage.aftt.j(context.getResources().getConfiguration(), typeface);
        if (typefaceJ != null) {
            typeface = typefaceJ;
        }
        textPaint.setTypeface(typeface);
        int i = this.d & (~typeface.getStyle());
        textPaint.setFakeBoldText(1 == (i & 1));
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(null);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
