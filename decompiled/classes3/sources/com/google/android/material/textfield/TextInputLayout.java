package com.google.android.material.textfield;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TextInputLayout extends android.widget.LinearLayout implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int s = 0;
    private static final int[][] t = {new int[]{android.R.attr.state_pressed}, new int[0]};
    private int A;
    private int B;
    private int C;
    private android.content.res.ColorStateList D;
    private int E;
    private gko F;
    private gko G;
    private android.content.res.ColorStateList H;
    private android.content.res.ColorStateList I;
    private android.content.res.ColorStateList J;
    private android.content.res.ColorStateList K;
    private boolean L;
    private java.lang.CharSequence M;
    private agaf N;
    private agaf O;
    private android.graphics.drawable.StateListDrawable P;
    private boolean Q;
    private agaf R;
    private agaf S;
    private agal T;
    private boolean U;
    private final int V;
    private int W;
    public final defpackage.agdo a;
    private android.animation.ValueAnimator aA;
    private boolean aB;
    private boolean aC;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private final android.graphics.Rect af;
    private final android.graphics.Rect ag;
    private final android.graphics.RectF ah;
    private android.graphics.drawable.Drawable ai;
    private int aj;
    private android.graphics.drawable.Drawable ak;
    private int al;
    private android.graphics.drawable.Drawable am;
    private android.content.res.ColorStateList an;
    private android.content.res.ColorStateList ao;
    private int ap;
    private int aq;
    private int ar;
    private android.content.res.ColorStateList as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private boolean ay;
    private boolean az;
    public final defpackage.agdf b;
    public android.widget.EditText c;
    public final defpackage.agdi d;
    public boolean e;
    public int f;
    public boolean g;
    public android.widget.TextView h;
    public java.lang.CharSequence i;
    public boolean j;
    public android.widget.TextView k;
    public boolean l;
    public int m;
    public final java.util.LinkedHashSet n;
    public int o;
    public boolean p;
    public final defpackage.afua q;
    public boolean r;
    private final android.widget.FrameLayout u;
    private final int v;
    private java.lang.CharSequence w;
    private int x;
    private int y;
    private int z;

    /* JADX WARN: Code duplicated, block: B:105:0x041a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0423  */
    /* JADX WARN: Code duplicated, block: B:121:0x045d  */
    /* JADX WARN: Code duplicated, block: B:124:0x047d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0486  */
    /* JADX WARN: Code duplicated, block: B:130:0x04b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:132:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:136:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:138:0x0504  */
    /* JADX WARN: Code duplicated, block: B:139:0x0509  */
    /* JADX WARN: Code duplicated, block: B:141:0x050f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0524  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:40:0x022b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0231  */
    /* JADX WARN: Code duplicated, block: B:43:0x0256  */
    /* JADX WARN: Code duplicated, block: B:45:0x025e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0283  */
    /* JADX WARN: Code duplicated, block: B:56:0x0296  */
    /* JADX WARN: Code duplicated, block: B:59:0x029e  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:65:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0345 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0347  */
    /* JADX WARN: Code duplicated, block: B:73:0x034a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0351  */
    /* JADX WARN: Code duplicated, block: B:79:0x036f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0375  */
    /* JADX WARN: Code duplicated, block: B:84:0x0388  */
    /* JADX WARN: Code duplicated, block: B:85:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:89:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:91:0x03da  */
    /* JADX WARN: Code duplicated, block: B:95:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:98:0x03fd  */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v71 */
    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int colorForState;
        android.content.res.ColorStateList colorStateListAv;
        ?? r2;
        java.lang.CharSequence charSequenceV;
        java.lang.CharSequence charSequenceV2;
        boolean zY;
        int iO;
        int iO2;
        int iO3;
        int i2;
        android.content.res.ColorStateList colorStateListS;
        android.content.res.ColorStateList colorStateListS2;
        android.content.res.ColorStateList colorStateListS3;
        android.content.res.ColorStateList colorStateList;
        float f;
        android.content.res.ColorStateList colorStateList2;
        defpackage.afyw afywVar;
        android.content.res.ColorStateList colorStateListAv2;
        super(agdv.a(context, attributeSet, i, 2132085327), attributeSet, i);
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        defpackage.agdi agdiVar = new defpackage.agdi(this);
        this.d = agdiVar;
        this.af = new android.graphics.Rect();
        this.ag = new android.graphics.Rect();
        this.ah = new android.graphics.RectF();
        this.n = new java.util.LinkedHashSet();
        defpackage.afua afuaVar = new defpackage.afua(this);
        this.q = afuaVar;
        this.aC = false;
        android.content.Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context2);
        this.u = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        android.animation.TimeInterpolator timeInterpolator = afpc.a;
        afuaVar.E = timeInterpolator;
        afuaVar.i(false);
        afuaVar.D = timeInterpolator;
        afuaVar.i(false);
        afuaVar.m(8388659);
        ajxw ajxwVarF = afvl.f(context2, attributeSet, defpackage.agdn.c, i, 2132085327, new int[]{22, 20, 40, 45, 50});
        defpackage.agdo agdoVar = new defpackage.agdo(this, ajxwVarF);
        this.a = agdoVar;
        this.L = ajxwVarF.y(48, true);
        m(ajxwVarF.v(4));
        this.az = ajxwVarF.y(47, true);
        this.ay = ajxwVarF.y(42, true);
        if (ajxwVarF.z(6)) {
            p(ajxwVarF.o(6, -1));
        } else if (ajxwVarF.z(3)) {
            q(ajxwVarF.n(3, -1));
        }
        if (ajxwVarF.z(5)) {
            n(ajxwVarF.o(5, -1));
        } else if (ajxwVarF.z(2)) {
            o(ajxwVarF.n(2, -1));
        }
        this.T = new agal(agal.m(context2, attributeSet, i, 2132085327));
        this.V = context2.getResources().getDimensionPixelOffset(2131167200);
        this.W = ajxwVarF.m(9, 0);
        this.v = getResources().getDimensionPixelSize(2131166770);
        this.ab = ajxwVarF.n(16, context2.getResources().getDimensionPixelSize(2131167201));
        this.ac = ajxwVarF.n(17, context2.getResources().getDimensionPixelSize(2131167202));
        this.aa = this.ab;
        float fB = ajxwVarF.B(13);
        float fB2 = ajxwVarF.B(12);
        float fB3 = ajxwVarF.B(10);
        float fB4 = ajxwVarF.B(11);
        aguv aguvVar = new aguv(this.T);
        if (fB >= 0.0f) {
            aguvVar.i(fB);
        }
        if (fB2 >= 0.0f) {
            aguvVar.j(fB2);
        }
        if (fB3 >= 0.0f) {
            aguvVar.h(fB3);
        }
        if (fB4 >= 0.0f) {
            aguvVar.g(fB4);
        }
        this.T = new agal(aguvVar);
        android.content.res.ColorStateList colorStateListAv3 = agab.av(context2, ajxwVarF, 7);
        if (colorStateListAv3 != null) {
            int defaultColor = colorStateListAv3.getDefaultColor();
            this.at = defaultColor;
            this.ae = defaultColor;
            if (colorStateListAv3.isStateful()) {
                this.au = colorStateListAv3.getColorForState(new int[]{-16842910}, -1);
                this.av = colorStateListAv3.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                this.aw = colorStateListAv3.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.av = this.at;
                android.content.res.ColorStateList colorStateListD = dvx.d(context2, 2131102070);
                this.au = colorStateListD.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListD.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
            if (ajxwVarF.z(1)) {
                android.content.res.ColorStateList colorStateListS4 = ajxwVarF.s(1);
                this.ao = colorStateListS4;
                this.an = colorStateListS4;
            }
            colorStateListAv = agab.av(context2, ajxwVarF, 14);
            this.ar = ajxwVarF.A(14);
            this.ap = context2.getColor(2131102097);
            this.ax = context2.getColor(2131102098);
            this.aq = context2.getColor(2131102101);
            if (colorStateListAv != null) {
                if (colorStateListAv.isStateful()) {
                    this.ap = colorStateListAv.getDefaultColor();
                    this.ax = colorStateListAv.getColorForState(new int[]{-16842910}, -1);
                    this.aq = colorStateListAv.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
                    this.ar = colorStateListAv.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                } else if (this.ar != colorStateListAv.getDefaultColor()) {
                    this.ar = colorStateListAv.getDefaultColor();
                }
                z();
            }
            if (ajxwVarF.z(15) && this.as != (colorStateListAv2 = agab.av(context2, ajxwVarF, 15))) {
                this.as = colorStateListAv2;
                z();
            }
            r2 = 0;
            if (ajxwVarF.r(50, -1) != -1) {
                defpackage.afza afzaVar = new defpackage.afza(afuaVar.a.getContext(), ajxwVarF.r(50, 0));
                colorStateList = afzaVar.k;
                if (colorStateList != null) {
                    afuaVar.i = colorStateList;
                }
                f = afzaVar.l;
                if (f != 0.0f) {
                    afuaVar.g = f;
                }
                colorStateList2 = afzaVar.a;
                if (colorStateList2 != null) {
                    afuaVar.I = colorStateList2;
                }
                afuaVar.G = afzaVar.f;
                afuaVar.H = afzaVar.g;
                afuaVar.F = afzaVar.h;
                afuaVar.J = afzaVar.j;
                afywVar = afuaVar.p;
                if (afywVar != null) {
                    afywVar.c();
                }
                afuaVar.p = new defpackage.afyw(new defpackage.aprf(afuaVar), afzaVar.a());
                afzaVar.b(afuaVar.a.getContext(), afuaVar.p);
                r2 = 0;
                r2 = 0;
                afuaVar.i(false);
                this.ao = afuaVar.i;
                if (this.c != null) {
                    x(false, false);
                    V();
                }
            }
            this.J = ajxwVarF.s(24);
            this.K = ajxwVarF.s(25);
            int iR = ajxwVarF.r(40, (int) r2);
            java.lang.CharSequence charSequenceV3 = ajxwVarF.v(35);
            int iO4 = ajxwVarF.o(34, 1);
            boolean zY2 = ajxwVarF.y(36, (boolean) r2);
            int iR2 = ajxwVarF.r(45, (int) r2);
            boolean zY3 = ajxwVarF.y(44, (boolean) r2);
            charSequenceV = ajxwVarF.v(43);
            int iR3 = ajxwVarF.r(58, (int) r2);
            charSequenceV2 = ajxwVarF.v(57);
            zY = ajxwVarF.y(18, (boolean) r2);
            iO = ajxwVarF.o(19, -1);
            if (this.f != iO) {
                if (iO > 0) {
                    this.f = iO;
                } else {
                    this.f = -1;
                }
                if (this.e) {
                    S();
                }
            }
            this.C = ajxwVarF.r(22, 0);
            this.B = ajxwVarF.r(20, 0);
            iO2 = ajxwVarF.o(8, 0);
            if (iO2 != this.m) {
                this.m = iO2;
                if (this.c != null) {
                    O();
                }
            }
            agdiVar.g(charSequenceV3);
            agdiVar.f(iO4);
            agdiVar.j(iR2);
            agdiVar.h(iR);
            if (this.k == null) {
                android.support.v7.widget.AppCompatTextView appCompatTextView = new android.support.v7.widget.AppCompatTextView(getContext());
                this.k = appCompatTextView;
                appCompatTextView.setId(2131429256);
                this.k.setImportantForAccessibility(1);
                this.k.setAccessibilityLiveRegion(1);
                gko gkoVarI = I();
                this.F = gkoVarI;
                ((gkz) gkoVarI).a = 67L;
                this.G = I();
                r(this.E);
                s(this.D);
                dzs.i(this.k, new defpackage.agdq(this));
            }
            if (android.text.TextUtils.isEmpty(charSequenceV2)) {
                R(false);
            } else {
                if (!this.j) {
                    R(true);
                }
                this.i = charSequenceV2;
            }
            W();
            r(iR3);
            if (ajxwVarF.z(41)) {
                agdiVar.i(ajxwVarF.s(41));
            }
            if (ajxwVarF.z(46)) {
                agdiVar.k(ajxwVarF.s(46));
            }
            if (ajxwVarF.z(51) && this.ao != (colorStateListS3 = ajxwVarF.s(51))) {
                if (this.an == null) {
                    afuaVar.l(colorStateListS3);
                }
                this.ao = colorStateListS3;
                if (this.c != null) {
                    x(false, false);
                }
            }
            if (ajxwVarF.z(23) && this.H != (colorStateListS2 = ajxwVarF.s(23))) {
                this.H = colorStateListS2;
                T();
            }
            if (ajxwVarF.z(21) && this.I != (colorStateListS = ajxwVarF.s(21))) {
                this.I = colorStateListS;
                T();
            }
            if (ajxwVarF.z(59)) {
                s(ajxwVarF.s(59));
            }
            defpackage.agdf agdfVar = new defpackage.agdf(this, ajxwVarF);
            this.b = agdfVar;
            boolean zY4 = ajxwVarF.y(0, true);
            iO3 = ajxwVarF.o(49, 1);
            if (iO3 != afuaVar.R) {
                afuaVar.R = iO3;
                afuaVar.i(false);
            }
            if (iO3 != afuaVar.Q) {
                afuaVar.Q = iO3;
                afuaVar.i(false);
            }
            requestLayout();
            ajxwVarF.x();
            setImportantForAccessibility(2);
            setImportantForAutofill(1);
            frameLayout.addView(agdoVar);
            frameLayout.addView(agdfVar);
            addView(frameLayout);
            setEnabled(zY4);
            l(zY3);
            k(zY2);
            if (this.e != zY) {
                if (zY) {
                    android.support.v7.widget.AppCompatTextView appCompatTextView2 = new android.support.v7.widget.AppCompatTextView(getContext());
                    this.h = appCompatTextView2;
                    appCompatTextView2.setId(2131429253);
                    this.h.setMaxLines(1);
                    agdiVar.a(this.h, 2);
                    ((android.view.ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131167203));
                    T();
                    S();
                } else {
                    agdiVar.e(this.h, 2);
                    this.h = null;
                }
                this.e = zY;
            }
            if (android.text.TextUtils.isEmpty(charSequenceV)) {
                if (A()) {
                    l(false);
                    return;
                }
                return;
            }
            if (!A()) {
                l(true);
            }
            agdiVar.c();
            agdiVar.m = charSequenceV;
            agdiVar.o.setText(charSequenceV);
            i2 = agdiVar.d;
            if (i2 != 2) {
                agdiVar.e = 2;
            }
            agdiVar.l(i2, agdiVar.e, agdiVar.m(agdiVar.o, charSequenceV));
        }
        colorForState = 0;
        this.ae = 0;
        this.at = 0;
        this.au = 0;
        this.av = 0;
        this.aw = colorForState;
        if (ajxwVarF.z(1)) {
            android.content.res.ColorStateList colorStateListS5 = ajxwVarF.s(1);
            this.ao = colorStateListS5;
            this.an = colorStateListS5;
        }
        colorStateListAv = agab.av(context2, ajxwVarF, 14);
        this.ar = ajxwVarF.A(14);
        this.ap = context2.getColor(2131102097);
        this.ax = context2.getColor(2131102098);
        this.aq = context2.getColor(2131102101);
        if (colorStateListAv != null) {
            if (colorStateListAv.isStateful()) {
                this.ap = colorStateListAv.getDefaultColor();
                this.ax = colorStateListAv.getColorForState(new int[]{-16842910}, -1);
                this.aq = colorStateListAv.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
                this.ar = colorStateListAv.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
            } else if (this.ar != colorStateListAv.getDefaultColor()) {
                this.ar = colorStateListAv.getDefaultColor();
            }
            z();
        }
        if (ajxwVarF.z(15)) {
            this.as = colorStateListAv2;
            z();
        }
        r2 = 0;
        if (ajxwVarF.r(50, -1) != -1) {
            defpackage.afza afzaVar2 = new defpackage.afza(afuaVar.a.getContext(), ajxwVarF.r(50, 0));
            colorStateList = afzaVar2.k;
            if (colorStateList != null) {
                afuaVar.i = colorStateList;
            }
            f = afzaVar2.l;
            if (f != 0.0f) {
                afuaVar.g = f;
            }
            colorStateList2 = afzaVar2.a;
            if (colorStateList2 != null) {
                afuaVar.I = colorStateList2;
            }
            afuaVar.G = afzaVar2.f;
            afuaVar.H = afzaVar2.g;
            afuaVar.F = afzaVar2.h;
            afuaVar.J = afzaVar2.j;
            afywVar = afuaVar.p;
            if (afywVar != null) {
                afywVar.c();
            }
            afuaVar.p = new defpackage.afyw(new defpackage.aprf(afuaVar), afzaVar2.a());
            afzaVar2.b(afuaVar.a.getContext(), afuaVar.p);
            r2 = 0;
            r2 = 0;
            afuaVar.i(false);
            this.ao = afuaVar.i;
            if (this.c != null) {
                x(false, false);
                V();
            }
        }
        this.J = ajxwVarF.s(24);
        this.K = ajxwVarF.s(25);
        int iR4 = ajxwVarF.r(40, (int) r2);
        java.lang.CharSequence charSequenceV4 = ajxwVarF.v(35);
        int iO5 = ajxwVarF.o(34, 1);
        boolean zY5 = ajxwVarF.y(36, (boolean) r2);
        int iR5 = ajxwVarF.r(45, (int) r2);
        boolean zY6 = ajxwVarF.y(44, (boolean) r2);
        charSequenceV = ajxwVarF.v(43);
        int iR6 = ajxwVarF.r(58, (int) r2);
        charSequenceV2 = ajxwVarF.v(57);
        zY = ajxwVarF.y(18, (boolean) r2);
        iO = ajxwVarF.o(19, -1);
        if (this.f != iO) {
            if (iO > 0) {
                this.f = iO;
            } else {
                this.f = -1;
            }
            if (this.e) {
                S();
            }
        }
        this.C = ajxwVarF.r(22, 0);
        this.B = ajxwVarF.r(20, 0);
        iO2 = ajxwVarF.o(8, 0);
        if (iO2 != this.m) {
            this.m = iO2;
            if (this.c != null) {
                O();
            }
        }
        agdiVar.g(charSequenceV4);
        agdiVar.f(iO5);
        agdiVar.j(iR5);
        agdiVar.h(iR4);
        if (this.k == null) {
            android.support.v7.widget.AppCompatTextView appCompatTextView3 = new android.support.v7.widget.AppCompatTextView(getContext());
            this.k = appCompatTextView3;
            appCompatTextView3.setId(2131429256);
            this.k.setImportantForAccessibility(1);
            this.k.setAccessibilityLiveRegion(1);
            gko gkoVarI2 = I();
            this.F = gkoVarI2;
            ((gkz) gkoVarI2).a = 67L;
            this.G = I();
            r(this.E);
            s(this.D);
            dzs.i(this.k, new defpackage.agdq(this));
        }
        if (android.text.TextUtils.isEmpty(charSequenceV2)) {
            R(false);
        } else {
            if (!this.j) {
                R(true);
            }
            this.i = charSequenceV2;
        }
        W();
        r(iR6);
        if (ajxwVarF.z(41)) {
            agdiVar.i(ajxwVarF.s(41));
        }
        if (ajxwVarF.z(46)) {
            agdiVar.k(ajxwVarF.s(46));
        }
        if (ajxwVarF.z(51)) {
            if (this.an == null) {
                afuaVar.l(colorStateListS3);
            }
            this.ao = colorStateListS3;
            if (this.c != null) {
                x(false, false);
            }
        }
        if (ajxwVarF.z(23)) {
            this.H = colorStateListS2;
            T();
        }
        if (ajxwVarF.z(21)) {
            this.I = colorStateListS;
            T();
        }
        if (ajxwVarF.z(59)) {
            s(ajxwVarF.s(59));
        }
        defpackage.agdf agdfVar2 = new defpackage.agdf(this, ajxwVarF);
        this.b = agdfVar2;
        boolean zY7 = ajxwVarF.y(0, true);
        iO3 = ajxwVarF.o(49, 1);
        if (iO3 != afuaVar.R) {
            afuaVar.R = iO3;
            afuaVar.i(false);
        }
        if (iO3 != afuaVar.Q) {
            afuaVar.Q = iO3;
            afuaVar.i(false);
        }
        requestLayout();
        ajxwVarF.x();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(agdoVar);
        frameLayout.addView(agdfVar2);
        addView(frameLayout);
        setEnabled(zY7);
        l(zY6);
        k(zY5);
        if (this.e != zY) {
            if (zY) {
                android.support.v7.widget.AppCompatTextView appCompatTextView4 = new android.support.v7.widget.AppCompatTextView(getContext());
                this.h = appCompatTextView4;
                appCompatTextView4.setId(2131429253);
                this.h.setMaxLines(1);
                agdiVar.a(this.h, 2);
                ((android.view.ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(2131167203));
                T();
                S();
            } else {
                agdiVar.e(this.h, 2);
                this.h = null;
            }
            this.e = zY;
        }
        if (android.text.TextUtils.isEmpty(charSequenceV)) {
            if (A()) {
                l(false);
                return;
            }
            return;
        }
        if (!A()) {
            l(true);
        }
        agdiVar.c();
        agdiVar.m = charSequenceV;
        agdiVar.o.setText(charSequenceV);
        i2 = agdiVar.d;
        if (i2 != 2) {
            agdiVar.e = 2;
        }
        agdiVar.l(i2, agdiVar.e, agdiVar.m(agdiVar.o, charSequenceV));
    }

    private final int D() {
        float fB;
        if (!this.L) {
            return 0;
        }
        int i = this.m;
        if (i == 0) {
            fB = this.q.b();
        } else {
            if (i != 2) {
                return 0;
            }
            boolean zAa = aa();
            defpackage.afua afuaVar = this.q;
            if (!zAa) {
                return java.lang.Math.max(0, (int) (afuaVar.b() - (afuaVar.a() / 2.0f)));
            }
            fB = afuaVar.b() / 2.0f;
        }
        return (int) fB;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    private final int E(int i, boolean z) {
        int iA;
        if (z) {
            if (h() != null) {
                iA = this.b.a();
            } else {
                iA = this.c.getCompoundPaddingLeft();
            }
        } else if (g() != null) {
            iA = this.a.a();
        } else {
            iA = this.c.getCompoundPaddingLeft();
        }
        return i + iA;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    private final int F(int i, boolean z) {
        int iA;
        if (z) {
            if (g() != null) {
                iA = this.a.a();
            } else {
                iA = this.c.getCompoundPaddingRight();
            }
        } else if (h() != null) {
            iA = this.b.a();
        } else {
            iA = this.c.getCompoundPaddingRight();
        }
        return i - iA;
    }

    private final android.graphics.Rect G(android.graphics.Rect rect) {
        if (this.c == null) {
            throw new java.lang.IllegalStateException();
        }
        android.graphics.Rect rect2 = this.ag;
        boolean zL = agab.L(this);
        rect2.bottom = rect.bottom;
        int i = this.m;
        if (i == 1) {
            rect2.left = E(rect.left, zL);
            rect2.top = rect.top + this.W;
            rect2.right = F(rect.right, zL);
        } else if (i != 2) {
            rect2.left = E(rect.left, zL);
            rect2.top = getPaddingTop();
            rect2.right = F(rect.right, zL);
        } else {
            rect2.left = rect.left + this.c.getPaddingLeft();
            rect2.top = rect.top - D();
            rect2.right = rect.right - this.c.getPaddingRight();
        }
        return rect2;
    }

    private final android.graphics.drawable.Drawable H() {
        agaf agafVar = this.O;
        if (agafVar != null) {
            return agafVar;
        }
        agaf agafVarJ = J(true);
        this.O = agafVarJ;
        return agafVarJ;
    }

    private final gko I() {
        gko gkoVar = new gko();
        ((gkz) gkoVar).b = agab.u(getContext(), 2130970063, 87);
        ((gkz) gkoVar).c = agab.C(getContext(), 2130970073, afpc.a);
        return gkoVar;
    }

    private final agaf J(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(2131167174);
        java.lang.Object obj = this.c;
        float dimensionPixelOffset2 = obj instanceof defpackage.agdl ? ((defpackage.agdl) obj).c : getResources().getDimensionPixelOffset(2131166557);
        float f = true != z ? 0.0f : dimensionPixelOffset;
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(2131167084);
        aguv aguvVar = new aguv((byte[]) null);
        aguvVar.i(f);
        aguvVar.j(f);
        aguvVar.g(dimensionPixelOffset);
        aguvVar.h(dimensionPixelOffset);
        agal agalVar = new agal(aguvVar);
        java.lang.Object obj2 = this.c;
        agaf agafVarJ = agaf.J(getContext(), dimensionPixelOffset2, obj2 instanceof defpackage.agdl ? ((defpackage.agdl) obj2).d : null);
        agafVarJ.q(agalVar);
        agad agadVar = agafVarJ.q;
        if (agadVar.i == null) {
            agadVar.i = new android.graphics.Rect();
        }
        agafVarJ.q.i.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        agafVarJ.invalidateSelf();
        return agafVarJ;
    }

    private final void K() {
        if (this.c == null || this.m != 1) {
            return;
        }
        if (!aa()) {
            android.widget.EditText editText = this.c;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.q.b() + this.v), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(2131166966));
            return;
        }
        if (agab.r(getContext())) {
            android.widget.EditText editText2 = this.c;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(2131166969), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(2131166968));
        } else if (agab.q(getContext())) {
            android.widget.EditText editText3 = this.c;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(2131166967), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(2131166966));
        }
    }

    private final void L() {
        agaf agafVar = this.N;
        if (agafVar != null) {
            agal agalVarEs = agafVar.es();
            agal agalVar = this.T;
            if (agalVarEs != agalVar) {
                this.N.q(agalVar);
            }
            if (this.m == 2 && Y()) {
                this.N.W(this.aa, this.ad);
            }
            int iG = this.ae;
            if (this.m == 1) {
                iG = dwm.g(this.ae, agab.aa(this, 2130969105, 0));
            }
            this.ae = iG;
            this.N.R(android.content.res.ColorStateList.valueOf(iG));
            agaf agafVar2 = this.R;
            if (agafVar2 != null && this.S != null) {
                if (Y()) {
                    agafVar2.R(this.c.isFocused() ? android.content.res.ColorStateList.valueOf(this.ap) : android.content.res.ColorStateList.valueOf(this.ad));
                    this.S.R(android.content.res.ColorStateList.valueOf(this.ad));
                }
                invalidate();
            }
            w();
        }
    }

    private final void M() {
        if (Z()) {
            ((defpackage.agcw) this.N).a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void N() {
        android.widget.TextView textView = this.k;
        if (textView == null || !this.j) {
            return;
        }
        textView.setText((java.lang.CharSequence) null);
        gld.b(this.u, this.G);
        this.k.setVisibility(4);
    }

    private final void O() {
        int i = this.m;
        if (i == 0) {
            this.N = null;
            this.R = null;
            this.S = null;
        } else if (i == 1) {
            this.N = new agaf(this.T);
            this.R = new agaf();
            this.S = new agaf();
        } else {
            if (i != 2) {
                throw new java.lang.IllegalArgumentException(i + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.L || (this.N instanceof defpackage.agcw)) {
                this.N = new agaf(this.T);
            } else {
                agal agalVar = this.T;
                int i2 = defpackage.agcw.b;
                if (agalVar == null) {
                    agalVar = new agal();
                }
                this.N = new defpackage.agcv(new defpackage.agcu(agalVar, new android.graphics.RectF()));
            }
            this.R = null;
            this.S = null;
        }
        w();
        z();
        if (this.m == 1) {
            if (agab.r(getContext())) {
                this.W = getResources().getDimensionPixelSize(2131166971);
            } else if (agab.q(getContext())) {
                this.W = getResources().getDimensionPixelSize(2131166970);
            }
        }
        K();
        if (this.m != 0) {
            V();
        }
        android.widget.EditText editText = this.c;
        if (editText instanceof android.widget.AutoCompleteTextView) {
            android.widget.AutoCompleteTextView autoCompleteTextView = (android.widget.AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.m;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(H());
                    return;
                }
                if (i3 == 1) {
                    if (this.P == null) {
                        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
                        this.P = stateListDrawable;
                        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, H());
                        this.P.addState(new int[0], J(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.P);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0090  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    private final void P() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float lineWidth;
        int i;
        int i2;
        if (Z()) {
            android.graphics.RectF rectF = this.ah;
            defpackage.afua afuaVar = this.q;
            int width = this.c.getWidth();
            int gravity = this.c.getGravity();
            boolean zQ = afuaVar.q(afuaVar.q);
            afuaVar.s = zQ;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zQ) {
                        i2 = afuaVar.d.left;
                        f3 = i2;
                    } else {
                        f = afuaVar.d.right;
                        f2 = afuaVar.M;
                    }
                } else if (zQ) {
                    f = afuaVar.d.right;
                    f2 = afuaVar.M;
                } else {
                    i2 = afuaVar.d.left;
                    f3 = i2;
                }
                android.graphics.Rect rect = afuaVar.d;
                rectF.left = java.lang.Math.max(f3, rect.left);
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                        if (afuaVar.s) {
                            f4 = rectF.left;
                            f5 = afuaVar.M;
                        } else {
                            i = rect.right;
                            f6 = i;
                        }
                    } else if (afuaVar.s) {
                        i = rect.right;
                        f6 = i;
                    } else {
                        f4 = rectF.left;
                        f5 = afuaVar.M;
                    }
                    rectF.right = java.lang.Math.min(f6, rect.right);
                    rectF.bottom = rect.top + afuaVar.b();
                    if (afuaVar.L != null && !afuaVar.u()) {
                        android.text.StaticLayout staticLayout = afuaVar.L;
                        lineWidth = staticLayout.getLineWidth(staticLayout.getLineCount() - 1) * (afuaVar.g / afuaVar.f);
                        if (afuaVar.s) {
                            rectF.left = rectF.right - lineWidth;
                        } else {
                            rectF.right = rectF.left + lineWidth;
                        }
                    }
                    if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                    }
                    float f7 = rectF.left;
                    float f8 = this.V;
                    rectF.left = f7 - f8;
                    rectF.right += f8;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.aa);
                    rectF.top = 0.0f;
                    ((defpackage.agcw) this.N).a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                f4 = width / 2.0f;
                f5 = afuaVar.M / 2.0f;
                f6 = f4 + f5;
                rectF.right = java.lang.Math.min(f6, rect.right);
                rectF.bottom = rect.top + afuaVar.b();
                if (afuaVar.L != null) {
                    android.text.StaticLayout staticLayout2 = afuaVar.L;
                    lineWidth = staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1) * (afuaVar.g / afuaVar.f);
                    if (afuaVar.s) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f) {
                }
            }
            f = width / 2.0f;
            f2 = afuaVar.M / 2.0f;
            f3 = f - f2;
            android.graphics.Rect rect2 = afuaVar.d;
            rectF.left = java.lang.Math.max(f3, rect2.left);
            rectF.top = rect2.top;
            if (gravity == 17) {
                f4 = width / 2.0f;
                f5 = afuaVar.M / 2.0f;
                f6 = f4 + f5;
            } else {
                f4 = width / 2.0f;
                f5 = afuaVar.M / 2.0f;
                f6 = f4 + f5;
            }
            rectF.right = java.lang.Math.min(f6, rect2.right);
            rectF.bottom = rect2.top + afuaVar.b();
            if (afuaVar.L != null) {
                android.text.StaticLayout staticLayout3 = afuaVar.L;
                lineWidth = staticLayout3.getLineWidth(staticLayout3.getLineCount() - 1) * (afuaVar.g / afuaVar.f);
                if (afuaVar.s) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    private static void Q(android.view.ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof android.view.ViewGroup) {
                Q((android.view.ViewGroup) childAt, z);
            }
        }
    }

    private final void R(boolean z) {
        if (this.j != z) {
            android.widget.TextView textView = this.k;
            if (!z) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                this.k = null;
            } else if (textView != null) {
                this.u.addView(textView);
                this.k.setVisibility(0);
            }
            this.j = z;
        }
    }

    private final void S() {
        if (this.h != null) {
            android.widget.EditText editText = this.c;
            u(editText == null ? null : editText.getText());
        }
    }

    private final void T() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateList2;
        android.widget.TextView textView = this.h;
        if (textView != null) {
            t(textView, this.g ? this.B : this.C);
            if (!this.g && (colorStateList2 = this.H) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (!this.g || (colorStateList = this.I) == null) {
                return;
            }
            this.h.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    private final void U() {
        android.content.res.ColorStateList colorStateList;
        android.content.res.ColorStateList colorStateListValueOf = this.J;
        if (colorStateListValueOf == null) {
            android.content.Context context = getContext();
            android.util.TypedValue typedValueW = agab.w(context, 2130968944);
            if (typedValueW == null) {
                colorStateListValueOf = null;
            } else if (typedValueW.resourceId != 0) {
                colorStateListValueOf = dvx.d(context, typedValueW.resourceId);
            } else if (typedValueW.data != 0) {
                colorStateListValueOf = android.content.res.ColorStateList.valueOf(typedValueW.data);
            } else {
                colorStateListValueOf = null;
            }
        }
        android.widget.EditText editText = this.c;
        if (editText == null || da$.ExternalSyntheticApiModelOutline0.m(editText) == null) {
            return;
        }
        android.graphics.drawable.Drawable drawableMutate = da$.ExternalSyntheticApiModelOutline0.m(this.c).mutate();
        if ((B() || (this.h != null && this.g)) && (colorStateList = this.K) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    private final void V() {
        if (this.m != 1) {
            android.widget.FrameLayout frameLayout = this.u;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iD = D();
            if (iD != layoutParams.topMargin) {
                layoutParams.topMargin = iD;
                frameLayout.requestLayout();
            }
        }
    }

    private final void W() {
        android.widget.EditText editText = this.c;
        y(editText == null ? null : editText.getText());
    }

    private final void X(boolean z, boolean z2) {
        int defaultColor = this.as.getDefaultColor();
        int colorForState = this.as.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.as.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ad = defaultColor;
    }

    private final boolean Y() {
        return this.aa >= 0 && this.ad != 0;
    }

    private final boolean Z() {
        return this.L && !android.text.TextUtils.isEmpty(this.M) && (this.N instanceof defpackage.agcw);
    }

    private final boolean aa() {
        return this.q.Q == 1;
    }

    private final boolean ab() {
        return this.m == 1 && this.c.getMinLines() <= 1;
    }

    static /* synthetic */ int c(android.text.Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final boolean A() {
        return this.d.n;
    }

    public final boolean B() {
        defpackage.agdi agdiVar = this.d;
        return (agdiVar.e != 1 || agdiVar.h == null || android.text.TextUtils.isEmpty(agdiVar.f)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    public final boolean C() {
        boolean z;
        boolean z2;
        if (this.c == null) {
            return false;
        }
        defpackage.agdo agdoVar = this.a;
        hr hrVar = null;
        if ((agdoVar.c.getDrawable() != null || (g() != null && agdoVar.a.getVisibility() == 0)) && agdoVar.getMeasuredWidth() > 0) {
            int iMax = java.lang.Math.max(0, agdoVar.getMeasuredWidth() - this.c.getPaddingLeft());
            if (this.ai == null || this.aj != iMax) {
                android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable();
                this.ai = colorDrawable;
                this.aj = iMax;
                colorDrawable.setBounds(0, 0, iMax, 1);
            }
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            android.graphics.drawable.Drawable drawable = compoundDrawablesRelative[0];
            android.graphics.drawable.Drawable drawable2 = this.ai;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.ai != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
            this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
            this.ai = null;
            z = true;
        } else {
            z = false;
        }
        defpackage.agdf agdfVar = this.b;
        if ((agdfVar.t() || ((agdfVar.r() && agdfVar.s()) || agdfVar.h != null)) && agdfVar.getMeasuredWidth() > 0) {
            int measuredWidth = agdfVar.i.getMeasuredWidth() - this.c.getPaddingRight();
            if (agdfVar.t()) {
                hrVar = agdfVar.b;
            } else if (agdfVar.r() && agdfVar.s()) {
                hrVar = agdfVar.d;
            }
            if (hrVar != null) {
                measuredWidth = measuredWidth + hrVar.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) hrVar.getLayoutParams()).getMarginStart();
            }
            int iMax2 = java.lang.Math.max(0, measuredWidth);
            android.graphics.drawable.Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            android.graphics.drawable.Drawable drawable3 = this.ak;
            if (drawable3 != null) {
                if (this.al != iMax2) {
                    this.al = iMax2;
                    drawable3.setBounds(0, 0, iMax2, 1);
                    this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ak, compoundDrawablesRelative3[3]);
                }
                return true;
            }
            android.graphics.drawable.ColorDrawable colorDrawable2 = new android.graphics.drawable.ColorDrawable();
            this.ak = colorDrawable2;
            this.al = iMax2;
            colorDrawable2.setBounds(0, 0, iMax2, 1);
            android.graphics.drawable.Drawable drawable4 = compoundDrawablesRelative3[2];
            android.graphics.drawable.Drawable drawable5 = this.ak;
            if (drawable4 != drawable5) {
                this.am = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ak != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ak) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.am, compoundDrawablesRelative4[3]);
                z2 = true;
            } else {
                z2 = z;
            }
            this.ak = null;
            return z2;
        }
        return z;
    }

    public final int a() {
        return this.b.e;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!(view instanceof android.widget.EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        android.widget.FrameLayout frameLayout = this.u;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        V();
        android.widget.EditText editText = (android.widget.EditText) view;
        if (this.c != null) {
            throw new java.lang.IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (a() != 3 && !(editText instanceof com.google.android.material.textfield.TextInputEditText)) {
            android.util.Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.c = editText;
        int i2 = this.x;
        if (i2 != -1) {
            p(i2);
        } else {
            q(this.z);
        }
        int i3 = this.y;
        if (i3 != -1) {
            n(i3);
        } else {
            o(this.A);
        }
        this.Q = false;
        O();
        defpackage.agds agdsVar = new defpackage.agds(this);
        android.widget.EditText editText2 = this.c;
        if (editText2 != null) {
            dzs.i(editText2, agdsVar);
        }
        defpackage.afua afuaVar = this.q;
        android.graphics.Typeface typeface = this.c.getTypeface();
        boolean zS = afuaVar.s(typeface);
        if (afuaVar.o != typeface) {
            afuaVar.o = typeface;
            afuaVar.n = defpackage.aftt.j(afuaVar.a.getContext().getResources().getConfiguration(), typeface);
            android.graphics.Typeface typeface2 = afuaVar.n;
            if (typeface2 == null) {
                typeface2 = afuaVar.o;
            }
            afuaVar.m = typeface2;
            z = true;
        } else {
            z = false;
        }
        if (zS || z) {
            afuaVar.i(false);
        }
        afuaVar.o(this.c.getTextSize());
        float letterSpacing = this.c.getLetterSpacing();
        if (afuaVar.K != letterSpacing) {
            afuaVar.K = letterSpacing;
            afuaVar.i(false);
        }
        int gravity = this.c.getGravity();
        afuaVar.m((gravity & (-113)) | 48);
        afuaVar.n(gravity);
        this.o = editText.getMinimumHeight();
        this.c.addTextChangedListener(new defpackage.agdp(this, editText));
        if (this.an == null) {
            this.an = this.c.getHintTextColors();
        }
        if (this.L) {
            if (android.text.TextUtils.isEmpty(this.M)) {
                java.lang.CharSequence hint = this.c.getHint();
                this.w = hint;
                m(hint);
                this.c.setHint((java.lang.CharSequence) null);
            }
            this.l = true;
        }
        U();
        if (this.h != null) {
            u(this.c.getText());
        }
        v();
        this.d.b();
        this.a.bringToFront();
        defpackage.agdf agdfVar = this.b;
        agdfVar.bringToFront();
        java.util.Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((defpackage.aprf) it.next()).k(this);
        }
        agdfVar.q();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        x(false, true);
    }

    public final int b() {
        android.widget.TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final com.google.android.material.internal.CheckableImageButton d() {
        return this.b.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(android.view.ViewStructure viewStructure, int i) {
        android.widget.EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.w != null) {
            boolean z = this.l;
            this.l = false;
            java.lang.CharSequence hint = editText.getHint();
            this.c.setHint(this.w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.l = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        android.widget.FrameLayout frameLayout = this.u;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            android.view.View childAt = frameLayout.getChildAt(i2);
            android.view.ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.c) {
                viewStructureNewChild.setHint(f());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        this.r = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r = false;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        agaf agafVar;
        super.draw(canvas);
        if (this.L) {
            defpackage.afua afuaVar = this.q;
            int iSave = canvas.save();
            if (afuaVar.r != null) {
                android.graphics.RectF rectF = afuaVar.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    android.text.TextPaint textPaint = afuaVar.B;
                    textPaint.setTextSize(afuaVar.u);
                    float f = afuaVar.k;
                    float f2 = afuaVar.l;
                    float f3 = afuaVar.t;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    if (afuaVar.t() && afuaVar.u()) {
                        float lineStart = afuaVar.k - afuaVar.L.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (afuaVar.O * f4));
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(afuaVar.v, afuaVar.w, afuaVar.x, agab.W(afuaVar.y, textPaint.getAlpha()));
                        }
                        afuaVar.L.draw(canvas);
                        textPaint.setAlpha((int) (afuaVar.N * f4));
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(afuaVar.v, afuaVar.w, afuaVar.x, agab.W(afuaVar.y, textPaint.getAlpha()));
                        }
                        int lineBaseline = afuaVar.L.getLineBaseline(0);
                        java.lang.CharSequence charSequence = afuaVar.P;
                        float f5 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            textPaint.setShadowLayer(afuaVar.v, afuaVar.w, afuaVar.x, afuaVar.y);
                        }
                        java.lang.String strTrim = afuaVar.P.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        java.lang.String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, java.lang.Math.min(afuaVar.L.getLineEnd(0), str.length()), 0.0f, f5, (android.graphics.Paint) textPaint);
                        canvas = canvas;
                    } else {
                        canvas.translate(f, f2);
                        afuaVar.L.draw(canvas);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.S == null || (agafVar = this.R) == null) {
            return;
        }
        agafVar.draw(canvas);
        if (this.c.isFocused()) {
            android.graphics.Rect bounds = this.S.getBounds();
            android.graphics.Rect bounds2 = this.R.getBounds();
            float f6 = this.q.b;
            int iCenterX = bounds2.centerX();
            bounds.left = afpc.b(iCenterX, bounds2.left, f6);
            bounds.right = afpc.b(iCenterX, bounds2.right, f6);
            this.S.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        boolean z;
        android.content.res.ColorStateList colorStateList;
        if (this.aB) {
            return;
        }
        this.aB = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        defpackage.afua afuaVar = this.q;
        if (afuaVar != null) {
            afuaVar.z = drawableState;
            android.content.res.ColorStateList colorStateList2 = afuaVar.i;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = afuaVar.h) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                afuaVar.i(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.c != null) {
            x(isLaidOut() && isEnabled(), false);
        }
        v();
        z();
        if (z) {
            invalidate();
        }
        this.aB = false;
    }

    public final java.lang.CharSequence e() {
        defpackage.agdi agdiVar = this.d;
        if (agdiVar.g) {
            return agdiVar.f;
        }
        return null;
    }

    public final java.lang.CharSequence f() {
        if (this.L) {
            return this.M;
        }
        return null;
    }

    public final java.lang.CharSequence g() {
        return this.a.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        android.widget.EditText editText = this.c;
        return editText != null ? editText.getBaseline() + getPaddingTop() + D() : super.getBaseline();
    }

    public final java.lang.CharSequence h() {
        return this.b.h;
    }

    final void i(float f) {
        defpackage.afua afuaVar = this.q;
        if (afuaVar.b != f) {
            if (this.aA == null) {
                android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                this.aA = valueAnimator;
                valueAnimator.setInterpolator(agab.C(getContext(), 2130970071, afpc.b));
                this.aA.setDuration(agab.u(getContext(), 2130970061, 167));
                this.aA.addUpdateListener(new defpackage.afvi(this, 7));
            }
            this.aA.setFloatValues(afuaVar.b, f);
            this.aA.start();
        }
    }

    public final void j(boolean z) {
        this.b.m(z);
    }

    public final void k(boolean z) {
        defpackage.agdi agdiVar = this.d;
        if (agdiVar.g != z) {
            agdiVar.c();
            if (z) {
                agdiVar.h = new android.support.v7.widget.AppCompatTextView(agdiVar.a);
                agdiVar.h.setId(2131429254);
                agdiVar.h.setTextAlignment(5);
                agdiVar.h(agdiVar.k);
                agdiVar.i(agdiVar.l);
                agdiVar.g(agdiVar.i);
                agdiVar.f(agdiVar.j);
                agdiVar.h.setVisibility(4);
                agdiVar.a(agdiVar.h, 0);
            } else {
                agdiVar.d();
                agdiVar.e(agdiVar.h, 0);
                agdiVar.h = null;
                com.google.android.material.textfield.TextInputLayout textInputLayout = agdiVar.b;
                textInputLayout.v();
                textInputLayout.z();
            }
            agdiVar.g = z;
        }
    }

    public final void l(boolean z) {
        defpackage.agdi agdiVar = this.d;
        if (agdiVar.n != z) {
            agdiVar.c();
            if (z) {
                agdiVar.o = new android.support.v7.widget.AppCompatTextView(agdiVar.a);
                agdiVar.o.setId(2131429255);
                agdiVar.o.setTextAlignment(5);
                agdiVar.o.setVisibility(4);
                agdiVar.o.setImportantForAccessibility(2);
                agdiVar.j(agdiVar.p);
                agdiVar.k(agdiVar.q);
                agdiVar.a(agdiVar.o, 1);
            } else {
                agdiVar.c();
                int i = agdiVar.d;
                if (i == 2) {
                    agdiVar.e = 0;
                }
                agdiVar.l(i, agdiVar.e, agdiVar.m(agdiVar.o, ""));
                agdiVar.e(agdiVar.o, 1);
                agdiVar.o = null;
                com.google.android.material.textfield.TextInputLayout textInputLayout = agdiVar.b;
                textInputLayout.v();
                textInputLayout.z();
            }
            agdiVar.n = z;
        }
    }

    public final void m(java.lang.CharSequence charSequence) {
        if (this.L) {
            if (!android.text.TextUtils.equals(charSequence, this.M)) {
                this.M = charSequence;
                defpackage.afua afuaVar = this.q;
                if (charSequence == null || !android.text.TextUtils.equals(afuaVar.q, charSequence)) {
                    afuaVar.q = charSequence;
                    afuaVar.r = null;
                    afuaVar.i(false);
                }
                if (!this.p) {
                    P();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void n(int i) {
        this.y = i;
        android.widget.EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public final void o(int i) {
        this.A = i;
        android.widget.EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.h(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        defpackage.agdf agdfVar = this.b;
        agdfVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.aC = false;
        int i = 1;
        if (this.c != null) {
            int iMax = java.lang.Math.max(agdfVar.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < iMax) {
                this.c.setMinimumHeight(iMax);
                z = true;
            }
        }
        boolean zC = C();
        if (z || zC) {
            this.c.post(new defpackage.agdr((java.lang.Object) this, i));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        android.widget.EditText editText = this.c;
        if (editText != null) {
            android.graphics.Rect rect = this.af;
            defpackage.afub.a(this, editText, rect);
            if (this.R != null) {
                this.R.setBounds(rect.left, rect.bottom - this.ab, rect.right, rect.bottom);
            }
            if (this.S != null) {
                this.S.setBounds(rect.left, rect.bottom - this.ac, rect.right, rect.bottom);
            }
            if (this.L) {
                defpackage.afua afuaVar = this.q;
                afuaVar.o(this.c.getTextSize());
                int gravity = this.c.getGravity();
                afuaVar.m((gravity & (-113)) | 48);
                afuaVar.n(gravity);
                afuaVar.k(G(rect));
                if (this.c == null) {
                    throw new java.lang.IllegalStateException();
                }
                android.graphics.Rect rect2 = this.ag;
                if (aa()) {
                    fDescent = afuaVar.c();
                } else {
                    android.text.TextPaint textPaint = afuaVar.C;
                    afuaVar.g(textPaint);
                    fDescent = afuaVar.j * ((-textPaint.ascent()) + textPaint.descent());
                }
                rect2.left = rect.left + this.c.getCompoundPaddingLeft();
                if (ab()) {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                } else {
                    compoundPaddingTop = (rect.top + this.c.getCompoundPaddingTop()) - ((this.m != 0 || aa()) ? 0 : (int) (afuaVar.c() / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.c.getCompoundPaddingRight();
                rect2.bottom = ab() ? (int) (rect2.top + fDescent) : rect.bottom - this.c.getCompoundPaddingBottom();
                int i5 = rect2.left;
                int i6 = rect2.top;
                int i7 = rect2.right;
                int i8 = rect2.bottom;
                android.graphics.Rect rect3 = afuaVar.c;
                if (!defpackage.afua.r(rect3, i5, i6, i7, i8) || !afuaVar.U) {
                    rect3.set(i5, i6, i7, i8);
                    afuaVar.A = true;
                    afuaVar.U = true;
                }
                afuaVar.i(false);
                if (!Z() || this.p) {
                    return;
                }
                P();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        android.widget.EditText editText;
        super.onMeasure(i, i2);
        if (!this.aC) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aC = true;
        }
        if (this.k != null && (editText = this.c) != null) {
            this.k.setGravity(editText.getGravity());
            this.k.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.q();
        if (aa()) {
            return;
        }
        int measuredWidth = (this.c.getMeasuredWidth() - this.c.getCompoundPaddingLeft()) - this.c.getCompoundPaddingRight();
        defpackage.afua afuaVar = this.q;
        android.text.TextPaint textPaint = afuaVar.C;
        afuaVar.f(textPaint);
        float f = measuredWidth;
        afuaVar.S = afuaVar.e(afuaVar.R, textPaint, afuaVar.q, (afuaVar.g / afuaVar.f) * f, afuaVar.s).getHeight();
        afuaVar.g(textPaint);
        afuaVar.T = afuaVar.e(afuaVar.Q, textPaint, afuaVar.q, f, afuaVar.s).getHeight();
        android.graphics.Rect rect = this.af;
        defpackage.afub.a(this, this.c, rect);
        afuaVar.k(G(rect));
        V();
        K();
        if (this.c != null) {
            int i3 = afuaVar.T;
            float fC = i3 != -1 ? i3 : afuaVar.c();
            float height = 0.0f;
            if (this.i != null) {
                android.text.TextPaint textPaint2 = new android.text.TextPaint(129);
                textPaint2.set(this.k.getPaint());
                textPaint2.setTextSize(this.k.getTextSize());
                textPaint2.setTypeface(this.k.getTypeface());
                textPaint2.setLetterSpacing(this.k.getLetterSpacing());
                try {
                    defpackage.afve afveVar = new defpackage.afve(this.i, textPaint2, measuredWidth);
                    afveVar.e = getLayoutDirection() == 1;
                    afveVar.d = true;
                    afveVar.b(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier());
                    afveVar.g = new defpackage.aprf(this);
                    height = afveVar.a().getHeight() + (this.m == 1 ? afuaVar.b() + this.W + this.v : 0.0f);
                } catch (defpackage.afvd e) {
                    android.util.Log.e("TextInputLayout", e.getCause().getMessage(), e);
                }
            }
            float fMax = java.lang.Math.max(fC, height);
            if (this.c.getMeasuredHeight() < fMax) {
                this.c.setMinimumHeight(java.lang.Math.round(fMax));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof com.google.android.material.textfield.TextInputLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.textfield.TextInputLayout.SavedState savedState = (com.google.android.material.textfield.TextInputLayout.SavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) savedState).d);
        java.lang.CharSequence charSequence = savedState.a;
        defpackage.agdi agdiVar = this.d;
        if (agdiVar.g) {
            if (android.text.TextUtils.isEmpty(charSequence)) {
                agdiVar.d();
            } else {
                agdiVar.c();
                agdiVar.f = charSequence;
                agdiVar.h.setText(charSequence);
                i = agdiVar.d;
                if (i != 1) {
                    agdiVar.e = 1;
                }
                agdiVar.l(i, agdiVar.e, agdiVar.m(agdiVar.h, charSequence));
            }
        } else if (!android.text.TextUtils.isEmpty(charSequence)) {
            k(true);
            if (android.text.TextUtils.isEmpty(charSequence)) {
                agdiVar.c();
                agdiVar.f = charSequence;
                agdiVar.h.setText(charSequence);
                i = agdiVar.d;
                if (i != 1) {
                    agdiVar.e = 1;
                }
                agdiVar.l(i, agdiVar.e, agdiVar.m(agdiVar.h, charSequence));
            } else {
                agdiVar.d();
            }
        }
        if (savedState.b) {
            post(new defpackage.agdr(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.U) {
            afzz afzzVar = this.T.b;
            android.graphics.RectF rectF = this.ah;
            float fA = afzzVar.a(rectF);
            float fA2 = this.T.c.a(rectF);
            float fA3 = this.T.e.a(rectF);
            float fA4 = this.T.d.a(rectF);
            agal agalVar = this.T;
            agab agabVar = agalVar.j;
            agab agabVar2 = agalVar.k;
            agab agabVar3 = agalVar.m;
            agab agabVar4 = agalVar.l;
            aguv aguvVar = new aguv((byte[]) null);
            aguvVar.t(agabVar2);
            aguvVar.u(agabVar);
            aguvVar.r(agabVar4);
            aguvVar.s(agabVar3);
            aguvVar.i(fA2);
            aguvVar.j(fA);
            aguvVar.g(fA4);
            aguvVar.h(fA3);
            agal agalVar2 = new agal(aguvVar);
            this.U = z;
            agaf agafVar = this.N;
            if (agafVar == null || agafVar.es() == agalVar2) {
                return;
            }
            this.T = agalVar2;
            L();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, com.google.android.material.textfield.TextInputLayout$SavedState] */
    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        ?? savedState = new com.google.android.material.textfield.TextInputLayout.SavedState(super.onSaveInstanceState());
        if (B()) {
            savedState.a = e();
        }
        defpackage.agdf agdfVar = this.b;
        boolean z = false;
        if (agdfVar.r() && agdfVar.d.a) {
            z = true;
        }
        savedState.b = z;
        return savedState;
    }

    public final void p(int i) {
        this.x = i;
        android.widget.EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public final void q(int i) {
        this.z = i;
        android.widget.EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public final void r(int i) {
        this.E = i;
        android.widget.TextView textView = this.k;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public final void s(android.content.res.ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            android.widget.TextView textView = this.k;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        Q(this, z);
        super.setEnabled(z);
    }

    public final void t(android.widget.TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (java.lang.Exception unused) {
        }
        textView.setTextAppearance(2132084161);
        textView.setTextColor(getContext().getColor(2131099826));
    }

    public final void u(android.text.Editable editable) {
        int iC = c(editable);
        boolean z = this.g;
        int i = this.f;
        if (i == -1) {
            this.h.setText(java.lang.String.valueOf(iC));
            this.h.setContentDescription(null);
            this.g = false;
        } else {
            this.g = iC > i;
            android.content.Context context = getContext();
            android.widget.TextView textView = this.h;
            int i2 = this.f;
            int i3 = true != this.g ? 2132018008 : 2132018009;
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iC);
            textView.setContentDescription(context.getString(i3, numValueOf, java.lang.Integer.valueOf(i2)));
            if (z != this.g) {
                T();
            }
            this.h.setText(dxt.a().b(getContext().getString(2132018010, numValueOf, java.lang.Integer.valueOf(this.f))));
        }
        if (this.c == null || z == this.g) {
            return;
        }
        x(false, false);
        z();
        v();
    }

    public final void v() {
        android.graphics.drawable.Drawable background;
        android.widget.TextView textView;
        android.widget.EditText editText = this.c;
        if (editText == null || this.m != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        android.graphics.Rect rect = iz.a;
        android.graphics.drawable.Drawable drawableMutate = background.mutate();
        if (B()) {
            drawableMutate.setColorFilter(ho.b(b(), android.graphics.PorterDuff.Mode.SRC_IN));
        } else if (this.g && (textView = this.h) != null) {
            drawableMutate.setColorFilter(ho.b(textView.getCurrentTextColor(), android.graphics.PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.c.refreshDrawableState();
        }
    }

    public final void w() {
        android.graphics.drawable.LayerDrawable rippleDrawable;
        android.widget.EditText editText = this.c;
        if (editText == null || this.N == null) {
            return;
        }
        if ((this.Q || editText.getBackground() == null) && this.m != 0) {
            android.widget.EditText editText2 = this.c;
            if (!(editText2 instanceof android.widget.AutoCompleteTextView) || defpackage.aftt.g(editText2)) {
                rippleDrawable = this.N;
            } else {
                int iX = agab.X(this.c, 2130968945);
                int i = this.m;
                if (i == 2) {
                    android.content.Context context = getContext();
                    android.graphics.drawable.Drawable drawable = this.N;
                    int[][] iArr = t;
                    int iZ = agab.Z(context, 2130969105, "TextInputLayout");
                    agaf agafVar = new agaf(drawable.es());
                    int iAb = agab.ab(iX, iZ, 0.1f);
                    agafVar.R(new android.content.res.ColorStateList(iArr, new int[]{iAb, 0}));
                    agafVar.setTint(iZ);
                    android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(iArr, new int[]{iAb, iZ});
                    agaf agafVar2 = new agaf(drawable.es());
                    agafVar2.setTint(-1);
                    rippleDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{new android.graphics.drawable.RippleDrawable(colorStateList, agafVar, agafVar2), drawable});
                } else if (i == 1) {
                    agaf agafVar3 = this.N;
                    int i2 = this.ae;
                    rippleDrawable = new android.graphics.drawable.RippleDrawable(new android.content.res.ColorStateList(t, new int[]{agab.ab(iX, i2, 0.1f), i2}), agafVar3, agafVar3);
                } else {
                    rippleDrawable = null;
                }
            }
            this.c.setBackground(rippleDrawable);
            this.Q = true;
        }
    }

    public final void x(boolean z, boolean z2) {
        android.content.res.ColorStateList colorStateList;
        android.widget.TextView textView;
        boolean zIsEnabled = isEnabled();
        android.widget.EditText editText = this.c;
        boolean z3 = (editText == null || android.text.TextUtils.isEmpty(editText.getText())) ? false : true;
        android.widget.EditText editText2 = this.c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        android.content.res.ColorStateList colorStateList2 = this.an;
        if (colorStateList2 != null) {
            this.q.j(colorStateList2);
        }
        if (!zIsEnabled) {
            android.content.res.ColorStateList colorStateList3 = this.an;
            int colorForState = this.ax;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            this.q.j(android.content.res.ColorStateList.valueOf(colorForState));
        } else if (B()) {
            defpackage.afua afuaVar = this.q;
            android.widget.TextView textView2 = this.d.h;
            afuaVar.j(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.g && (textView = this.h) != null) {
            this.q.j(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ao) != null) {
            this.q.l(colorStateList);
        }
        if (z3 || !this.ay || (isEnabled() && z4)) {
            if (z2 || this.p) {
                android.animation.ValueAnimator valueAnimator = this.aA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aA.cancel();
                }
                if (z && this.az) {
                    i(1.0f);
                } else {
                    this.q.p(1.0f);
                }
                this.p = false;
                if (Z()) {
                    P();
                }
                W();
                this.a.c(false);
                this.b.f(false);
                return;
            }
            return;
        }
        if (z2 || !this.p) {
            android.animation.ValueAnimator valueAnimator2 = this.aA;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aA.cancel();
            }
            if (z && this.az) {
                i(0.0f);
            } else {
                this.q.p(0.0f);
            }
            if (Z() && !((defpackage.agcw) this.N).a.w.isEmpty()) {
                M();
            }
            this.p = true;
            N();
            this.a.c(true);
            this.b.f(true);
        }
    }

    public final void y(android.text.Editable editable) {
        if (c(editable) != 0 || this.p) {
            N();
            return;
        }
        if (this.k == null || !this.j || android.text.TextUtils.isEmpty(this.i)) {
            return;
        }
        this.k.setText(this.i);
        gld.b(this.u, this.F);
        this.k.setVisibility(0);
        this.k.bringToFront();
    }

    public final void z() {
        int currentTextColor;
        android.widget.TextView textView;
        int i;
        int i2;
        android.widget.EditText editText;
        android.widget.EditText editText2;
        if (this.N == null || this.m == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.c) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.c) != null && editText.isHovered());
        if (!isEnabled()) {
            this.ad = this.ax;
        } else if (!B()) {
            if (!this.g || (textView = this.h) == null) {
                if (z) {
                    currentTextColor = this.ar;
                } else {
                    currentTextColor = z2 ? this.aq : this.ap;
                }
            } else if (this.as != null) {
                X(z, z2);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            this.ad = currentTextColor;
        } else if (this.as != null) {
            X(z, z2);
        } else {
            this.ad = b();
        }
        U();
        defpackage.agdf agdfVar = this.b;
        agdfVar.p();
        com.google.android.material.textfield.TextInputLayout textInputLayout = agdfVar.a;
        afsq.y(textInputLayout, agdfVar.b, agdfVar.c);
        agdfVar.g();
        if (agdfVar.c().u()) {
            if (!textInputLayout.B() || agdfVar.b() == null) {
                afsq.x(textInputLayout, agdfVar.d, agdfVar.f, agdfVar.g);
            } else {
                android.graphics.drawable.Drawable drawableMutate = agdfVar.b().mutate();
                drawableMutate.setTint(textInputLayout.b());
                agdfVar.d.setImageDrawable(drawableMutate);
            }
        }
        this.a.d();
        if (this.m == 2) {
            int i3 = this.aa;
            if (z && isEnabled()) {
                i2 = this.ac;
                this.aa = i2;
            } else {
                i2 = this.ab;
                this.aa = i2;
            }
            if (i2 != i3 && Z() && !this.p) {
                M();
                P();
            }
        }
        if (this.m == 1) {
            if (isEnabled()) {
                if (!z2 || z) {
                    i = z ? this.av : this.at;
                } else {
                    i = this.aw;
                }
                this.ae = i;
            } else {
                this.ae = this.au;
            }
        }
        L();
        if (a() == 3) {
            android.widget.EditText editText3 = this.c;
            if (!(editText3 instanceof android.widget.AutoCompleteTextView) || defpackage.aftt.g(editText3)) {
                d().setFocusable(true);
                d().setClickable(true);
            } else {
                d().setFocusable(false);
                d().setClickable(false);
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.afqt(9);
        java.lang.CharSequence a;
        boolean b;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.b = parcel.readInt() == 1;
        }

        public final java.lang.String toString() {
            return "TextInputLayout.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " error=" + java.lang.String.valueOf(this.a) + '}';
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            android.text.TextUtils.writeToParcel(this.a, parcel, i);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970861);
    }

    public TextInputLayout(android.content.Context context) {
        this(context, null);
    }
}
