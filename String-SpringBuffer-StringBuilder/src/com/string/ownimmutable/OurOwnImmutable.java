package com.string.ownimmutable;

final class OurOwnImmutable {
	private int i;

	public OurOwnImmutable(int i) {
		this.i = i;
	}

	public OurOwnImmutable modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return new OurOwnImmutable(i);
		}
	}

	public static void main(String[] args) {
		OurOwnImmutable t = new OurOwnImmutable(10);
		OurOwnImmutable t1 = t.modify(100);
		OurOwnImmutable t2 = t.modify(10);
		System.out.println(t == t1);
		System.out.println(t == t2);

	}
}
