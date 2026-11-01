package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dtv extends android.view.ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    boolean E;
    boolean F;
    public float G;
    public float H;
    public java.lang.String I;
    float J;
    int K;
    public float L;
    public float M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public float V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public int a;
    public boolean aa;
    public boolean ab;
    public java.lang.String ac;
    public int ad;
    public boolean ae;
    public boolean af;
    public boolean ag;
    public boolean ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public int al;
    public int am;
    public int an;
    public int ao;
    public int ap;
    public int aq;
    public float ar;
    public int as;
    public int at;
    public float au;
    public defpackage.dsy av;
    public boolean aw;
    public int b;
    public float c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    public dtv(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new defpackage.dsy();
        this.aw = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.dui.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = defpackage.dtu.a.get(index);
            switch (i2) {
                case 1:
                    this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                    this.p = resourceId;
                    if (resourceId == -1) {
                        this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                    this.r = f;
                    if (f < 0.0f) {
                        this.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    this.a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.a);
                    break;
                case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                    this.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.b);
                    break;
                case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                    this.c = typedArrayObtainStyledAttributes.getFloat(index, this.c);
                    break;
                case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId2;
                    if (resourceId2 == -1) {
                        this.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                    this.f = resourceId3;
                    if (resourceId3 == -1) {
                        this.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                    this.g = resourceId4;
                    if (resourceId4 == -1) {
                        this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                    this.h = resourceId5;
                    if (resourceId5 == -1) {
                        this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                    this.i = resourceId6;
                    if (resourceId6 == -1) {
                        this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId7;
                    if (resourceId7 == -1) {
                        this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                    this.k = resourceId8;
                    if (resourceId8 == -1) {
                        this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                    this.l = resourceId9;
                    if (resourceId9 == -1) {
                        this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                    this.m = resourceId10;
                    if (resourceId10 == -1) {
                        this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                    this.s = resourceId11;
                    if (resourceId11 == -1) {
                        this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                    this.t = resourceId12;
                    if (resourceId12 == -1) {
                        this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                    this.u = resourceId13;
                    if (resourceId13 == -1) {
                        this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                    this.v = resourceId14;
                    if (resourceId14 == -1) {
                        this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                    break;
                case 22:
                    this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                    break;
                case 23:
                    this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                    break;
                case 24:
                    this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                    break;
                case 25:
                    this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                    break;
                case 26:
                    this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                    break;
                case 27:
                    this.aa = typedArrayObtainStyledAttributes.getBoolean(index, this.aa);
                    break;
                case 28:
                    this.ab = typedArrayObtainStyledAttributes.getBoolean(index, this.ab);
                    break;
                case 29:
                    this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                    break;
                case 30:
                    this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                    break;
                case 31:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    this.P = i3;
                    if (i3 == 1) {
                        android.util.Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    this.Q = i4;
                    if (i4 == 1) {
                        android.util.Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    } catch (java.lang.Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                            this.R = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                    } catch (java.lang.Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                            this.T = -2;
                        }
                    }
                    break;
                case 35:
                    this.V = java.lang.Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                    this.P = 2;
                    break;
                case 36:
                    try {
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                    } catch (java.lang.Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                            this.S = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                    } catch (java.lang.Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                            this.U = -2;
                        }
                    }
                    break;
                case 38:
                    this.W = java.lang.Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                    this.Q = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            due.i(this, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                            break;
                        case 46:
                            this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                            break;
                        case 47:
                            this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                            break;
                        case 50:
                            this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                            break;
                        case 51:
                            this.ac = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                            this.n = resourceId15;
                            if (resourceId15 == -1) {
                                this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                            this.o = resourceId16;
                            if (resourceId16 == -1) {
                                this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 55:
                            this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    due.h(this, typedArrayObtainStyledAttributes, index, 0);
                                    this.E = true;
                                    break;
                                case 65:
                                    due.h(this, typedArrayObtainStyledAttributes, index, 1);
                                    this.F = true;
                                    break;
                                case 66:
                                    this.ad = typedArrayObtainStyledAttributes.getInt(index, this.ad);
                                    break;
                                case 67:
                                    this.d = typedArrayObtainStyledAttributes.getBoolean(index, this.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        a();
    }

    public final void a() {
        this.ah = false;
        this.ae = true;
        this.af = true;
        if (this.width == -2 && this.aa) {
            this.ae = false;
            if (this.P == 0) {
                this.P = 1;
            }
        }
        if (this.height == -2 && this.ab) {
            this.af = false;
            if (this.Q == 0) {
                this.Q = 1;
            }
        }
        if (this.width == 0 || this.width == -1) {
            this.ae = false;
            if (this.width == 0 && this.P == 1) {
                this.width = -2;
                this.aa = true;
            }
        }
        if (this.height == 0 || this.height == -1) {
            this.af = false;
            if (this.height == 0 && this.Q == 1) {
                this.height = -2;
                this.ab = true;
            }
        }
        if (this.c == -1.0f && this.a == -1 && this.b == -1) {
            return;
        }
        this.ah = true;
        this.ae = true;
        this.af = true;
        if (!(this.av instanceof defpackage.dtb)) {
            this.av = new defpackage.dtb();
        }
        ((defpackage.dtb) this.av).c(this.Z);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0045  */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6 = this.leftMargin;
        int i7 = this.rightMargin;
        super.resolveLayoutDirection(i);
        int layoutDirection = getLayoutDirection();
        this.an = -1;
        this.ao = -1;
        this.al = -1;
        this.am = -1;
        this.ap = this.w;
        this.aq = this.y;
        float f = this.G;
        this.ar = f;
        int i8 = this.a;
        this.as = i8;
        int i9 = this.b;
        this.at = i9;
        float f2 = this.c;
        this.au = f2;
        int i10 = this.s;
        if (layoutDirection == 1) {
            if (i10 != -1) {
                this.an = i10;
            } else {
                int i11 = this.t;
                if (i11 != -1) {
                    this.ao = i11;
                } else {
                    z = false;
                }
                i2 = this.u;
                if (i2 != -1) {
                    this.am = i2;
                    z = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.al = i3;
                    z = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.aq = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.ap = i5;
                }
                if (z) {
                    this.ar = 1.0f - f;
                }
                if (this.ah && this.Z == 1 && this.d) {
                    if (f2 != -1.0f) {
                        this.au = 1.0f - f2;
                        this.as = -1;
                        this.at = -1;
                    } else {
                        if (i8 != -1) {
                            this.at = i8;
                            this.as = -1;
                        } else if (i9 != -1) {
                            this.as = i9;
                            this.at = -1;
                        }
                        this.au = -1.0f;
                    }
                }
            }
            z = true;
            i2 = this.u;
            if (i2 != -1) {
                this.am = i2;
                z = true;
            }
            i3 = this.v;
            if (i3 != -1) {
                this.al = i3;
                z = true;
            }
            i4 = this.A;
            if (i4 != Integer.MIN_VALUE) {
                this.aq = i4;
            }
            i5 = this.B;
            if (i5 != Integer.MIN_VALUE) {
                this.ap = i5;
            }
            if (z) {
                this.ar = 1.0f - f;
            }
            if (this.ah) {
                if (f2 != -1.0f) {
                    this.au = 1.0f - f2;
                    this.as = -1;
                    this.at = -1;
                } else {
                    if (i8 != -1) {
                        this.at = i8;
                        this.as = -1;
                    } else if (i9 != -1) {
                        this.as = i9;
                        this.at = -1;
                    }
                    this.au = -1.0f;
                }
            }
        } else {
            if (i10 != -1) {
                this.am = i10;
            }
            int i12 = this.t;
            if (i12 != -1) {
                this.al = i12;
            }
            i2 = this.u;
            if (i2 != -1) {
                this.an = i2;
            }
            i3 = this.v;
            if (i3 != -1) {
                this.ao = i3;
            }
            int i13 = this.A;
            if (i13 != Integer.MIN_VALUE) {
                this.ap = i13;
            }
            int i14 = this.B;
            if (i14 != Integer.MIN_VALUE) {
                this.aq = i14;
            }
        }
        if (i2 == -1 && i3 == -1 && this.t == -1 && i10 == -1) {
            int i15 = this.g;
            if (i15 != -1) {
                this.an = i15;
                if (this.rightMargin <= 0 && i7 > 0) {
                    this.rightMargin = i7;
                }
            } else {
                int i16 = this.h;
                if (i16 != -1) {
                    this.ao = i16;
                    if (this.rightMargin <= 0 && i7 > 0) {
                        this.rightMargin = i7;
                    }
                }
            }
            int i17 = this.e;
            if (i17 != -1) {
                this.al = i17;
                if (this.leftMargin > 0 || i6 <= 0) {
                    return;
                }
                this.leftMargin = i6;
                return;
            }
            int i18 = this.f;
            if (i18 != -1) {
                this.am = i18;
                if (this.leftMargin > 0 || i6 <= 0) {
                    return;
                }
                this.leftMargin = i6;
            }
        }
    }

    public dtv() {
        super(-2, -2);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new defpackage.dsy();
        this.aw = false;
    }

    public dtv(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = -1;
        this.b = -1;
        this.c = -1.0f;
        this.d = true;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0.0f;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Integer.MIN_VALUE;
        this.z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        this.B = Integer.MIN_VALUE;
        this.C = Integer.MIN_VALUE;
        this.D = 0;
        this.E = true;
        this.F = true;
        this.G = 0.5f;
        this.H = 0.5f;
        this.I = null;
        this.J = 0.0f;
        this.K = 1;
        this.L = -1.0f;
        this.M = -1.0f;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = 1.0f;
        this.W = 1.0f;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.aa = false;
        this.ab = false;
        this.ac = null;
        this.ad = 0;
        this.ae = true;
        this.af = true;
        this.ag = false;
        this.ah = false;
        this.ai = false;
        this.aj = false;
        this.ak = false;
        this.al = -1;
        this.am = -1;
        this.an = -1;
        this.ao = -1;
        this.ap = Integer.MIN_VALUE;
        this.aq = Integer.MIN_VALUE;
        this.ar = 0.5f;
        this.av = new defpackage.dsy();
        this.aw = false;
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            this.leftMargin = marginLayoutParams.leftMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
            setMarginStart(marginLayoutParams.getMarginStart());
            setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (layoutParams instanceof defpackage.dtv) {
            defpackage.dtv dtvVar = (defpackage.dtv) layoutParams;
            this.a = dtvVar.a;
            this.b = dtvVar.b;
            this.c = dtvVar.c;
            this.d = dtvVar.d;
            this.e = dtvVar.e;
            this.f = dtvVar.f;
            this.g = dtvVar.g;
            this.h = dtvVar.h;
            this.i = dtvVar.i;
            this.j = dtvVar.j;
            this.k = dtvVar.k;
            this.l = dtvVar.l;
            this.m = dtvVar.m;
            this.n = dtvVar.n;
            this.o = dtvVar.o;
            this.p = dtvVar.p;
            this.q = dtvVar.q;
            this.r = dtvVar.r;
            this.s = dtvVar.s;
            this.t = dtvVar.t;
            this.u = dtvVar.u;
            this.v = dtvVar.v;
            this.w = dtvVar.w;
            this.x = dtvVar.x;
            this.y = dtvVar.y;
            this.z = dtvVar.z;
            this.A = dtvVar.A;
            this.B = dtvVar.B;
            this.C = dtvVar.C;
            this.D = dtvVar.D;
            this.G = dtvVar.G;
            this.H = dtvVar.H;
            this.I = dtvVar.I;
            this.J = dtvVar.J;
            this.K = dtvVar.K;
            this.L = dtvVar.L;
            this.M = dtvVar.M;
            this.N = dtvVar.N;
            this.O = dtvVar.O;
            this.aa = dtvVar.aa;
            this.ab = dtvVar.ab;
            this.P = dtvVar.P;
            this.Q = dtvVar.Q;
            this.R = dtvVar.R;
            this.T = dtvVar.T;
            this.S = dtvVar.S;
            this.U = dtvVar.U;
            this.V = dtvVar.V;
            this.W = dtvVar.W;
            this.X = dtvVar.X;
            this.Y = dtvVar.Y;
            this.Z = dtvVar.Z;
            this.ae = dtvVar.ae;
            this.af = dtvVar.af;
            this.ag = dtvVar.ag;
            this.ah = dtvVar.ah;
            this.al = dtvVar.al;
            this.am = dtvVar.am;
            this.an = dtvVar.an;
            this.ao = dtvVar.ao;
            this.ap = dtvVar.ap;
            this.aq = dtvVar.aq;
            this.ar = dtvVar.ar;
            this.ac = dtvVar.ac;
            this.ad = dtvVar.ad;
            this.av = dtvVar.av;
            this.E = dtvVar.E;
            this.F = dtvVar.F;
        }
    }
}
